package com.fybdp.jpademo.model;

import java.util.List;

import javax.persistence.Table;

@Table(name = "businesses")
public class Business extends BaseModel {

    private String name;

    private List<User> userList;

}
