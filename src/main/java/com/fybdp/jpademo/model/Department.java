package com.fybdp.jpademo.model;

import java.util.List;

import javax.persistence.Table;

@Table(name = "departments")
public class Department extends BaseModel {

    private String name;

    private List<User> userList;
}
