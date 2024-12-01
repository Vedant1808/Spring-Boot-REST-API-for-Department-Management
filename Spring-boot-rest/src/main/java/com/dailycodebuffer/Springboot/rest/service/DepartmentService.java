package com.dailycodebuffer.Springboot.rest.service;

import com.dailycodebuffer.Springboot.rest.entity.Department;
import com.dailycodebuffer.Springboot.rest.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
