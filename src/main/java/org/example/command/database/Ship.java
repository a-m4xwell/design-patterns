package org.example.command.database;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Ship {
    private String name;
    private String grossTons;
    private String length;
    private String currentLocation;
}
