package com.cybertek.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regions")// Table ismini ismi "regions" olarak değiştiriyorum, çünkü data.sql de Tabbe ismi "regions" olarak isimlendirdik.
@Getter
@Setter
@NoArgsConstructor
public class Region extends BaseEntity{

    private String region;
    private String country;
}
