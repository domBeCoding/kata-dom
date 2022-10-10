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
        LazyInitialisedSingleton singleton1 = LazyInitialisedSingleton.getSingleton();
        LazyInitialisedSingleton singleton2 = LazyInitialisedSingleton.getSingleton();
        Assertions.assertEquals(singleton1, singleton2);
    }

    @Test
    public void assertStaticLazyInitialisedSingletonTest() {
        StaticInitialisedSingleton singleton1 = StaticInitialisedSingleton.getStaticInitalisedSingleton();
        StaticInitialisedSingleton singleton2 =StaticInitialisedSingleton.getStaticInitalisedSingleton();
        Assertions.assertEquals(singleton1, singleton2);
    }

    @Test
    public void givenASingleton_whenNameIsSet_ObjectsAreEqual(){
        Person person1 = (Person) applicationContext.getBean("personSingleton");
        Person person2 = (Person) applicationContext.getBean("personSingleton");

        person1.setName("Dominic");
        String name = person2.getName();

        Assertions.assertEquals("Dominic", name);
    }

    @Test
    public void givenAUniquePerson_whenNameIsSet_ObjectsAreNotEqual(){
        UniquePerson person1 = (UniquePerson) applicationContext.getBean("uniquePerson");
        UniquePerson person2 = (UniquePerson) applicationContext.getBean("uniquePerson");

        person1.setName("Dominic");
        person2.setName("Carolyn");

        Assertions.assertNotEquals(person1.getName(), person2.getName());
    }
}