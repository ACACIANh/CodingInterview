package com.example.codinginterview.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyStackImplTest {

    private MyStack<String> myStack;

    @BeforeEach
    void init() {
        myStack = new MyStackImpl<>();
    }

    @Test
    void FILO() throws Exception {
        myStack.push("first");
        myStack.push("second");
        String item = myStack.pop();
        Assertions.assertThat(item).isEqualTo("second");
    }

    @Test
    void Exception() throws Exception {

        Assertions.assertThatThrownBy(() -> myStack.pop()).isInstanceOf(IndexOutOfBoundsException.class);
    }

}