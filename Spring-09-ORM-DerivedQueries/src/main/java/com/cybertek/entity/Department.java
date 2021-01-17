package com.cybertek.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departments") // ismi "departments" olarak değiştiriyorum, çünkü data.sql de "departments" olarak isimlendirdiğimden
@Getter
@Setter
@NoArgsConstructor
public class Department {

    @Id // "departments" tableda id olarak "department" columnu alıyoruz ve bunlar belli olduğundan otomatik olarak oluşturulmasına gerek yok.
    private String department;
    private String division;

}
