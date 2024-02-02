package org.example.chain_of_responsibility;

import org.example.chain_of_responsibility.release.Release;
import org.example.chain_of_responsibility.release.ReleaseService;
import org.example.chain_of_responsibility.release.ReleaseType;
import org.example.chain_of_responsibility.release.auth_chain.*;

import java.util.List;

public class Main {
    /*
    * The Chain of Responsibility pattern is used to decouple the sender of a request from its receiver, this is done
    * by providing a series of objects that could potentially handle a request and organising them into a chain. Each
    * link in the chain either handles the request of passes it onto the next link.
    *
    * In this example we will build a software release management system, in this system developers can request
    * approval to perform a release. They first input the details of what they intend to change, this includes a
    * category that the change falls into. Once complete they submit it for approval, the system looks at the release
    * passes it to our approval chain, this chain represents all the people that might be required to approve the
    * release depending on what has been changes, it will then contact the relevant approvers and notify them of the
    * request for change, there will be
    *   Product Owners, required for all releases
    *   Product Managers, required for releases with new features
    *   Engineering Managers, required for any changes that required a change to the core design
    *   Finance Managers, required for all changes involving the billing of customers
    *   CTO, required for nuclear changes, those that could make or break the company
    * */

    public static void main(String[] args) {
        /*Setup*/

        //construct the auth chain
        //the order is most specific to most general
        /*CTO>Finance>EngineeringManager>ProductManager>ProductOwner */
        ProductOwner po = new ProductOwner(null);
        ProductManager pm = new ProductManager(po);
        EngineeringManager em = new EngineeringManager(pm);
        FinanceManager fm = new FinanceManager(em);
        Cto cto = new Cto(fm);

        ReleaseService releaseService = new ReleaseService(cto);

        //Make the release
        Release bugFix = new Release("Bug Fix","Fixed a bug", List.of(ReleaseType.BUG));
        //Seek approval
        //Only the Product owner should be asked for approval
        releaseService.getReleaseApproval(bugFix);

        //new feature
        //PO and PM should be asked for approval
        Release feature = new Release("New Feature", "Added a new feature to the system", List.of(ReleaseType.FEATURE));
        releaseService.getReleaseApproval(feature);

        //new feature that changes the billing system
        //PO, PM and Finance Manager notified
        Release billing = new Release("New billing system", "A change to the billing system", List.of(ReleaseType.FEATURE, ReleaseType.FINANCE_CHANGE));
        releaseService.getReleaseApproval(billing);

        //Nuclear release
        //PO and CTO notified
        Release nuclear = new Release("Nuclear Release", "A completely new system", List.of(ReleaseType.NUCLEAR));
        releaseService.getReleaseApproval(nuclear);

    }
}
