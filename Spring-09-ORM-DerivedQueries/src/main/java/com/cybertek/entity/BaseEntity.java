package com.cybertek.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class BaseEntity {

    @Id // data.sql de id olduğundan postgres a otomatik ürettirmiyoruz.
    private Integer id;
}


