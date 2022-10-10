package com.kata.katawithdom;

import com.kata.katawithdom.singleton.LazyInitialisedSingleton;
import com.kata.katawithdom.singleton.StaticInitialisedSingleton;
import com.kata.katawithdom.singleton.model.Person;
import com.kata.katawithdom.singleton.model.UniquePerson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SingletonTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void assertLazyInitialisedSingletonTest() {

    }

    @Test
    public void assertStaticLazyInitialisedSingletonTest() {

    }

    @Test
    public void givenASingleton_whenNameIsSet_ObjectsAreEqual(){

    }

    @Test
    public void givenAUniquePerson_whenNameIsSet_ObjectsAreNotEqual(){

    }
}