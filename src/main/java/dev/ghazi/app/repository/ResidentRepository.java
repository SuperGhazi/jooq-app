package dev.ghazi.app.repository;

import dev.ghazi.jooq.generated.tables.records.ResidentRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static dev.ghazi.jooq.generated.Tables.RESIDENT;

@Repository
public class ResidentRepository {

    private final DSLContext dsl;

    public ResidentRepository(DSLContext dsl) {
        this.dsl = dsl;
    }

    public List<ResidentRecord> findAll() {
        return dsl.selectFrom(RESIDENT).fetchInto(ResidentRecord.class);
    }
}
