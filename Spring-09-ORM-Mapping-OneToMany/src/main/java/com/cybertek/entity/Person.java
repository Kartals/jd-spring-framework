package com.cybertek.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @OneToMany (mappedBy = "person") // bunu yaparak person_address table creat edilmiyor.
    private List<Address> address;

    /*
    @OneToMany
    @JoinColumn (name="person_id")
    private List<Address> address;
     */

}
