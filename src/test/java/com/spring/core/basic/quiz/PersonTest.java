package com.spring.core.basic.quiz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void personTest() {

        Person kim = Person.getInstance();
        Person pack = Person.getInstance();

        System.out.println(kim);
        System.out.println(pack);

    }

}