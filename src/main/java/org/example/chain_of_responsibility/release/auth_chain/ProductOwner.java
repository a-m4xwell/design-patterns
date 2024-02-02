package org.example.chain_of_responsibility.release.auth_chain;

import org.example.chain_of_responsibility.release.Release;

public class ProductOwner extends Authorizer{
    public ProductOwner(Authorizer successor) {
        super(successor);
    }

    @Override
    public void approveRelease(Release release) {
        //Approves all releases
        System.out.println("Request sent to the Product Owner for approval");
        callSuccessor(release);
    }
}
