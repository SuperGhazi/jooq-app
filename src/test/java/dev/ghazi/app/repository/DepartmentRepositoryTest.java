package dev.ghazi.app.repository;

import dev.ghazi.app.tables.records.DepartmentRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void insert() {
        assertDoesNotThrow(() -> {
            var department = new DepartmentRecord();
            department.setName("test");
            var inserted = departmentRepository.insert(department);
            assertEquals("test", inserted.getName(), "Inserted department name should match");
            departmentRepository.deleteByName("test");
        });
    }
}
