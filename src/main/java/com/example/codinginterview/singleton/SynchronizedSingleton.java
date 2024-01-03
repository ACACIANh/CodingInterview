package com.example.codinginterview.singleton;

public class SynchronizedSingleton {

    private static volatile SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        System.out.println(this.getClass().getSimpleName() + ".constructor()");
    }

    /*
    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
    */

    public static SynchronizedSingleton getInstance() {
        if (instance == null) {
            synchronized (SynchronizedSingleton.class) {
                if (instance == null) {
                    instance = new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
