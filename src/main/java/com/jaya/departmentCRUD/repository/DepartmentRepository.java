package com.jaya.departmentCRUD.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jaya.departmentCRUD.entity.Department;

@Repository
public interface DepartmentRepository
    extends CrudRepository<Department, Long> {
}