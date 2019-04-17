package com.fybdp.jpademo.controller;

import com.fybdp.jpademo.model.Business;
import com.fybdp.jpademo.model.Department;
import com.fybdp.jpademo.repository.DepartmentRepository;
import com.fybdp.jpademo.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private DepartmentRepository departmentRepository;
    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentRepository departmentRepository, DepartmentService departmentService) {
        this.departmentRepository = departmentRepository;
        this.departmentService = departmentService;
    }

    @GetMapping()
    public List<Department> getDepartmentList() {
        return departmentRepository.findAll();
    }
}
