package com.dailycodebuffer.Springboot.rest.controller;

import com.dailycodebuffer.Springboot.rest.entity.Department;
import com.dailycodebuffer.Springboot.rest.service.DepartmentService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp() {
        department=Department.builder()
                .departmentName("Designing")
                .departmentCode("DS-01")
                .departmentAddress("Delhi")
                .departmentId(13L)
                .build();
    }

    @Test
    void saveDepartment() throws  Exception{
        Department inputdeparment=Department.builder()
                .departmentAddress("Delhi")
                .departmentCode("DS-01")
                .departmentName("Designing")
                .build();

        Mockito.when(departmentService.saveDepartment(inputdeparment))
                .thenReturn(department);

        mockMvc.perform(MockMvcRequestBuilders.post("/departments")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "    \"departmentName\":\"IT\",\n" +
                        "    \"departmentAddress\":\"Ahemdabad\",\n" +
                        "    \"departmentCode\":\"IT-932\"\n" +
                        "}")).andExpect(status().isOk());
    }

    @Test
    void fetchDepartmentById() throws  Exception{
        Mockito.when(departmentService.fetchDepartmentById(1L))
                .thenReturn(department);

        mockMvc.perform(MockMvcRequestBuilders.get("/departments/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.departmentName").value(department.getDepartmentName()));
    }
}
