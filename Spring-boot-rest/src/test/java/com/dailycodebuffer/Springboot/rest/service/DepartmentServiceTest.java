package com.dailycodebuffer.Springboot.rest.service;

import com.dailycodebuffer.Springboot.rest.entity.Department;
import com.dailycodebuffer.Springboot.rest.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department=Department
                .builder()
                .departmentName("PO")
                .departmentCode("PO-09")
                .departmentAddress("Indore")
                .departmentId(1L)
                .build();

        Mockito.when(departmentRepository.findByDepartmentName("PO"))
                .thenReturn(department);
    }

    @Test
    @DisplayName("Get data when valid department get")
    public void whenValidDepartmentName_thenDepartmentShouldFound()
    {
           String departmentName="PO";
           Department found=departmentService.fetchDepartmentByName(departmentName);
           assertEquals(departmentName,found.getDepartmentName());
    }



}

