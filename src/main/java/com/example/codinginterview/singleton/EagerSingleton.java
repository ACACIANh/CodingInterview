package com.example.codinginterview.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println(this.getClass().getSimpleName() + ".constructor()");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
