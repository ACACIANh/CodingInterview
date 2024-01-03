package com.example.codinginterview.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void eagerSingleton() throws Exception {

        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        Assertions.assertThat(instance1).isEqualTo(instance2);
    }

    @Test
    void synchronizedSingleton() throws Exception {

        SynchronizedSingleton instance1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton instance2 = SynchronizedSingleton.getInstance();
        Assertions.assertThat(instance1).isEqualTo(instance2);
    }

    @Test
    void lazySingleton() throws Exception {

        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        Assertions.assertThat(instance1).isEqualTo(instance2);
    }

    @Test
    void lazyHolderSingleton() throws Exception {

        LazyHolderSingleton instance1 = LazyHolderSingleton.getInstance();
        LazyHolderSingleton instance2 = LazyHolderSingleton.getInstance();
        Assertions.assertThat(instance1).isEqualTo(instance2);
    }

    @Test
    void enumSingleton() throws Exception {

        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        Assertions.assertThat(instance1).isEqualTo(instance2);
    }
}