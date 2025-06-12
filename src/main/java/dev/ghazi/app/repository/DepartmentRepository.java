package dev.ghazi.app.repository;

import dev.ghazi.app.tables.records.DepartmentRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static dev.ghazi.app.Tables.DEPARTMENT;

@Repository
public class DepartmentRepository {

    private final DSLContext dsl;

    public DepartmentRepository(DSLContext dsl) {
        this.dsl = dsl;
    }

    public List<DepartmentRecord> findAll() {
        return dsl.selectFrom(DEPARTMENT).fetchInto(DepartmentRecord.class);
    }
}
