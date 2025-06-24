package dev.ghazi.app.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class ResidentRepositoryTest {

    @Autowired
    ResidentRepository residentRepository;

    @Test
    void findAll() {
        var residents = residentRepository.findAll();
        residents.forEach(System.out::println);
        assertFalse(residents.isEmpty(), "Residents should not be empty");
    }
}
