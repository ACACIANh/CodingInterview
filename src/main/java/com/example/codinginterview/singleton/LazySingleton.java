package com.example.codinginterview.singleton;

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
        System.out.println(this.getClass().getSimpleName() + ".constructor()");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
