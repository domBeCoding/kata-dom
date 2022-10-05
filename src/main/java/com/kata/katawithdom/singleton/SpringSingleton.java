package com.kata.katawithdom.singleton;

import com.kata.katawithdom.singleton.model.Person;
import com.kata.katawithdom.singleton.model.UniquePerson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringSingleton {

    @Bean
    @Scope("singleton")
    public Person personSingleton(){
        return new Person();
    }

    @Bean
    @Scope("prototype")
    public UniquePerson uniquePerson(){
        return new UniquePerson();
    }
}
