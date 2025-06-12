package dev.ghazi.app.tables.daos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentDaoTest {

    @Autowired
    DepartmentDao departmentDao;

    @Test
    void findAll() {
        var departments = departmentDao.findAll();
        departments.forEach(System.out::println);
        assertFalse(departments.isEmpty(), "Departments should not be empty");
    }
}
