package com.company;

public class Main {

    public static void main(String[] args) {

        // invoking register method of singleton class to register
        Singleton user1 = Singleton.register("santosh@gamil.com");
        System.out.println(user1.hashCode());

        // same user trying to register again, but the singleton class doesn't allow registering twice
        Singleton user2 = Singleton.register("santosh@gmail.com");
        System.out.println(user2.hashCode());

    }
}
