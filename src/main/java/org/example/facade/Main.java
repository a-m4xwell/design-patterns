package org.example.facade;

import org.example.facade.subsystem.Rooter;
import org.example.facade.subsystem.SubsystemFacade;

public class Main {
    public static void main(String[] args) {
        /*The facade pattern essentially provides a simplified interface to a subsystem. It is good for reducing
        complexity in an application and reducing dependencies between systems. it also makes subsystems more flexible
         and extendable. This can happen with any need to change or recompile clients*/

        /*In this example I will have a subsystem that is responsible for performing various calculations, for the
        * sake of the demo I will make it overly comlpex but from this clients perspective it only needs to deal with
        * the facade*/

        //Acts as the facade of the subsystem, creates transparency, the subsystem can be changed without this client
        //being any the wiser
        SubsystemFacade subsystemFacade = new SubsystemFacade();

        System.out.println(subsystemFacade.add(4,8));
        System.out.println(subsystemFacade.subtract(12, 4));
        System.out.println(subsystemFacade.multiply(3, 9));
        System.out.println(subsystemFacade.divide(12, 3));
        System.out.println(subsystemFacade.root(123));
        System.out.println(subsystemFacade.square(6));

        //The facade does not mean clients cannot use underlying classes, where required they can, for example.
        System.out.println(Rooter.square(10));

    }
}
