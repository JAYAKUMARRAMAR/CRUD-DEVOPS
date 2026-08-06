package com.jaya.departmentCRUD.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jaya.departmentCRUD.entity.Department;
import com.jaya.departmentCRUD.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired private DepartmentService departmentService;

    // Save operation
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

    // Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
            department, departmentId);
    }

    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
        departmentService.deleteDepartmentById(
            departmentId);
        return "Deleted Successfully";
    }
}