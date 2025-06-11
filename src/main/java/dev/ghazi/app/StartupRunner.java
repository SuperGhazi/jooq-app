package dev.ghazi.app;

import dev.ghazi.app.repository.DepartmentRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements ApplicationRunner {

    private final DepartmentRepository departmentRepository;

    public StartupRunner(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("startup runner");
        departmentRepository.findAll().forEach(d -> System.out.println(d));
    }
}
