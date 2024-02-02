package org.example.proxy;

public class Main {
    /*
    * The Proxy pattern
    * The intent is to provide a surrogate or placeholder for another object to control access to it.
    *
    * There are 3 4 types of proxy
    * Virtual proxies - these defer the instantiation of large complex objects to when they are required
    * Remote Proxies - This provides access to a remote object, it will encode and sent the request to a remote address
    * Protection proxies - control access to a protected object. they evaluate access rights and either allow or deni access
    * Smart references - provide some kind of reference counting so objects can be deleted when no longer required
    *
    * In this example I will implement a proxy in the following scenario
    * This is a game about driving in a gridded city, the object is to get to The Complex, The Complex is a large
    * abstract building, it had many vertices and complicated shapes therefore it's costly to render. I will write a
    * proxy to represent The Complex when it's not on screen, but when it's draw function is called the Proxy will
    * instantiate it.
    * */
    public static void main(String[] args) {
        //todo finish this example

    }
}
