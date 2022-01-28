package com.company;

import java.util.HashMap;
import java.util.Map;

public class Singleton {

    // This is a singleton class which doesn't allow user to register into database twice.
    // If the user is trying to register twice, it just returns the reference to the first instantiation.
    // userData is a small database to store user's data.

    static Map<Integer,String> userData = new HashMap<Integer,String>();
    int count = 1;

    // Private constructor doesn't allow to instantiate an object from another class
    // Constructor stores the data of the user in userData database
    private Singleton(String email){
        userData.put(count, email);
        count++;
        System.out.println("Your registration is completed "+email);
    }

    // static variable reference
    private static Singleton username;

    // register method is used to create an instance of private singleton class
    // If the user is already registered,
    // else allows to register
    public static Singleton register(String email) {
        if (userData.containsKey(email) == false && username == null) {
            username = new Singleton(email);
            System.out.println("User "+email+" is register at location: ");
        }
        else{
            System.out.println("User already exist at: ");
        }
        return username;
    }


}
