package org.example.chain_of_responsibility.release.auth_chain;

import org.example.chain_of_responsibility.release.Release;
import org.example.chain_of_responsibility.release.ReleaseType;

public class FinanceManager extends Authorizer{
    public FinanceManager(Authorizer successor) {
        super(successor);
    }

    @Override
    public void approveRelease(Release release) {
        //Approves releases that contain changes to the finance system
        if(release.getReleaseTypes().contains(ReleaseType.FINANCE_CHANGE)){
            System.out.println("Request sent to the Finance Manager for approval");
        }
        callSuccessor(release);
    }
}
