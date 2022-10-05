package com.kata.katawithdom;

import com.kata.katawithdom.singleton.LazyInitialisedSingleton;
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
        LazyInitialisedSingleton singleton1 = LazyInitialisedSingleton.getSingleton();
        LazyInitialisedSingleton singleton2 = LazyInitialisedSingleton.getSingleton();
        Assertions.assertEquals(singleton1, singleton2);
    }

    @Test
    public void assertStaticLazyInitialisedSingletonTest() {
        LazyInitialisedSingleton singleton1 = LazyInitialisedSingleton.getSingleton();
        LazyInitialisedSingleton singleton2 = LazyInitialisedSingleton.getSingleton();
        Assertions.assertEquals(singleton1, singleton2);
    }

    @Test
    public void givenASingleton_whenNameIsSet_ObjectsAreEqual(){

        Person person1 = (Person) applicationContext.getBean("personSingleton");
        Person person2 = (Person) applicationContext.getBean("personSingleton");

        person1.setName("Carolyn");
        String actualName = person2.getName();

        Assertions.assertEquals("Carolyn", actualName);
    }

    @Test
    public void givenAUniquePerson_whenNameIsSet_ObjectsAreNotEqual(){

        UniquePerson person1 = (UniquePerson) applicationContext.getBean("uniquePerson");
        UniquePerson person2 = (UniquePerson) applicationContext.getBean("uniquePerson");

        person1.setName("Carolyn");
        person2.setName("Dominic");

        Assertions.assertNotEquals("Carolyn", person2.getName());
        Assertions.assertEquals("Carolyn", person1.getName());
        Assertions.assertEquals("Dominic", person2.getName());
    }

}