package org.example.chain_of_responsibility.release.auth_chain;

import org.example.chain_of_responsibility.release.Release;
import org.example.chain_of_responsibility.release.ReleaseType;

public class ProductManager extends Authorizer{
    public ProductManager(Authorizer successor) {
        super(successor);
    }

    @Override
    public void approveRelease(Release release) {
        //Approves releases that contain new features
        if(release.getReleaseTypes().contains(ReleaseType.FEATURE)){
            System.out.println("Request sent to the Product Manager for approval");
        }
        callSuccessor(release);
    }
}
