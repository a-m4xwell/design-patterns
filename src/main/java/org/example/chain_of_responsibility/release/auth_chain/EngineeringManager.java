package org.example.chain_of_responsibility.release.auth_chain;

import org.example.chain_of_responsibility.release.Release;
import org.example.chain_of_responsibility.release.ReleaseType;

public class EngineeringManager extends Authorizer{
    public EngineeringManager(Authorizer successor) {
        super(successor);
    }

    @Override
    public void approveRelease(Release release) {
        //Approves requests that contain design changes
        if(release.getReleaseTypes().contains(ReleaseType.DESIGN_CHANGE)){
            System.out.println("Request sent to the Engineering Manager for approval");
        }
        callSuccessor(release);
    }
}
