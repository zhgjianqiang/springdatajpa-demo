package com.fybdp.jpademo.repository;

import com.fybdp.jpademo.model.Department;
import com.fybdp.jpademo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartmentRepository extends JpaRepository<Department, String>, JpaSpecificationExecutor<Department> {

}
