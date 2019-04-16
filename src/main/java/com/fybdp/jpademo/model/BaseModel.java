package com.fybdp.jpademo.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.ZonedDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
@Data
public abstract class BaseModel {

    private String id;

    @CreatedDate
    private ZonedDateTime createTime;

    @LastModifiedDate
    private ZonedDateTime updateTime;
}
