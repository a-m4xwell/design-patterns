package org.example.chain_of_responsibility.release.auth_chain;

import lombok.AllArgsConstructor;
import org.example.chain_of_responsibility.release.Release;

@AllArgsConstructor
public abstract class Authorizer {
    protected Authorizer successor;
    public abstract void approveRelease(Release release);

    protected void callSuccessor(Release release){
        if (successor != null){
            successor.approveRelease(release);
        }
    }
}
