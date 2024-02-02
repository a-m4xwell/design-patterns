package org.example.adapter.example;

public class Main {

    public static void main(String[] args) {
        /*Setup*/

        /*Main*/
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("3v using Object Adapter = " + v3.getVolts());
        System.out.println("12v using Object Adapter = " + v12.getVolts());
        System.out.println("120v using Object Adapter = " + v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("3v using Class Adapter = " + v3.getVolts());
        System.out.println("12v using Class Adapter = " + v12.getVolts());
        System.out.println("120v using Class Adapter = " + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i){
            case 3: return socketAdapter.get3Volt();
            case 12: return socketAdapter.get12Volt();
            case 120: return socketAdapter.get120Volt();
            default: return socketAdapter.get120Volt();
        }
    }

}
