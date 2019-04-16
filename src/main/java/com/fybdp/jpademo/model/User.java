package com.fybdp.jpademo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseModel {

    private String name;

    private Address address;

    private Department department;

    private List<Business> businessList;
}
