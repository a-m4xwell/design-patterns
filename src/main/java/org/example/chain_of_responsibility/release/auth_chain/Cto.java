package org.example.chain_of_responsibility.release.auth_chain;

import org.example.chain_of_responsibility.release.Release;
import org.example.chain_of_responsibility.release.ReleaseType;

public class Cto extends Authorizer{
    public Cto(Authorizer successor) {
        super(successor);
    }

    @Override
    public void approveRelease(Release release) {
        //Approves nuclear releases
        if(release.getReleaseTypes().contains(ReleaseType.NUCLEAR)){
            System.out.println("Request sent to the CTO for approval");
        }
        callSuccessor(release);
    }
}
