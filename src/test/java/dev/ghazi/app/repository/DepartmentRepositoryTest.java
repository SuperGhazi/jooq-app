package dev.ghazi.app.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class DepartmentRepositoryTest {

    @Autowired
    DepartmentRepository departmentRepository;

    @Test
    void findAll() {
        var departments = departmentRepository.findAll();
        departments.forEach(System.out::println);
        assertFalse(departments.isEmpty(), "Departments should not be empty");
    }
}
