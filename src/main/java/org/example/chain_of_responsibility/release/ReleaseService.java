package org.example.chain_of_responsibility.release;

import lombok.AllArgsConstructor;
import org.example.chain_of_responsibility.release.auth_chain.Authorizer;

@AllArgsConstructor
public class ReleaseService {

    private Authorizer authorizer;

    public void getReleaseApproval(Release release) {
        System.out.println("Seeking approval for release " + release.getTitle());
        authorizer.approveRelease(release);
    }
}
