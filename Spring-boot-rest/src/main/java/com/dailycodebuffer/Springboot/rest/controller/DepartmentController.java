package com.dailycodebuffer.Springboot.rest.controller;

import com.dailycodebuffer.Springboot.rest.entity.Department;
import com.dailycodebuffer.Springboot.rest.error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboot.rest.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER= LoggerFactory.getLogger(DepartmentController.class);

    //http://localhost:8082/departments
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department)
    {
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id")Long departmentId) throws DepartmentNotFoundException
    {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId)
    {
        departmentService.deleteDepartmentById(departmentId);
       return "Department deleted Successfully!!";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@RequestBody Department department,@PathVariable("id")Long departmentId)
    {
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name")String departmentName)
    {
       return departmentService.fetchDepartmentByName(departmentName);
    }
}
