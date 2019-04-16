package com.fybdp.jpademo.model;

import javax.persistence.Table;

import lombok.Data;

@Table(name = "addresses")
@Data
public class Address extends BaseModel {

    private String name;

    private User user;
}
