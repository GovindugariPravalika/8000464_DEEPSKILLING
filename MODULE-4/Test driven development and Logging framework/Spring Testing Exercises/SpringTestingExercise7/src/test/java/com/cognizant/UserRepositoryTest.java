package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void testFindByName() {

        repository.save(new User(1L, "Rahul"));
        repository.save(new User(2L, "Rahul"));
        repository.save(new User(3L, "Amit"));

        List<User> users = repository.findByName("Rahul");

        assertEquals(2, users.size());
        assertEquals("Rahul", users.get(0).getName());
    }
}