package com.example.codinginterview.singleton;

public class LazyHolderSingleton {

    public LazyHolderSingleton() {
        System.out.println(this.getClass().getSimpleName() + ".constructor()");
    }

    private static class Holder {
        private static final LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    public static LazyHolderSingleton getInstance() {
        return Holder.instance;
    }
}
