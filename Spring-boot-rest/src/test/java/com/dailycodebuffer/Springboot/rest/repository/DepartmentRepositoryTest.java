package com.dailycodebuffer.Springboot.rest.repository;

import com.dailycodebuffer.Springboot.rest.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Department department=Department
                .builder()
                .departmentId(1000L)
                .departmentAddress("Mumbai")
                .departmentCode("MM-01")
                .departmentName("MM")
                .build();

        entityManager.persist(department);
        entityManager.flush();
    }

    @Test
    @Disabled
    public void whenFindById_thenReturnDepartment()
    {
        Department department=departmentRepository.findById(1000L).get();
        assertEquals(department.getDepartmentName(),"MM");
    }
}