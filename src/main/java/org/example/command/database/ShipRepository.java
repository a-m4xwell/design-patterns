package org.example.command.database;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShipRepository {
    /*This class represents the receiver in the Command Pattern
    * */

    //Getter is for testing purposes only
    @Getter
    private List<Ship> ships;

    public ShipRepository(){
        ships = new ArrayList<>();
    }

    public void create(Ship ship) {
        ships.add(ship);
    }

    public Optional<Ship> read(String name) {
        return ships.stream()
                .filter(
                        ship -> ship.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public void update(Ship ship) {
        for (int i = 0; i <= ships.size(); i++) {
            Ship s = ships.get(i);
            if (s.getName().equalsIgnoreCase(ship.getName())) {
                ships.remove(s);
                ships.add(ship);
                break;
            }
        }
    }

    public void delete(Ship ship) {
        ships = ships.stream()
                .filter(s -> !s.getName().equalsIgnoreCase(ship.getName()))
                .toList();
    }
}
