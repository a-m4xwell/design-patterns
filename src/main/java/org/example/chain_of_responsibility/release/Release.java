package org.example.chain_of_responsibility.release;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Release {

    private String title;
    private String description;
    private List<ReleaseType> releaseTypes;

}
