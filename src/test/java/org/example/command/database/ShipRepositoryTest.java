package org.example.command.database;

import org.junit.jupiter.api.Test;

import java.util.Optional;

class ShipRepositoryTest {

    @Test
    public void test(){
        ShipRepository target = new ShipRepository();

        target.create(new Ship("Boaty", "123", "12m", "Inverness"));

        //repository should only contain one ship
        assert target.getShips().size() == 1;

        Optional<Ship> present = target.read("Boaty");
        Optional<Ship> notPresent = target.read("Boaty2");

        //Existing ship is present and oposite
        assert present.isPresent();
        assert notPresent.isEmpty();

        target.update(new Ship("Boaty", "321", "13m", "Arran"));
        Ship updatedShip = target.getShips().get(0);

        //Ship was updated
        assert updatedShip.getGrossTons().equalsIgnoreCase("321");

        target.delete(new Ship("Boaty", "", "", ""));
        //ship was deleted
        assert target.getShips().size() == 0;
    }
}