package com.cybertek.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "post_tag_rel",        //name whatever you want to Join table, genelde _rel ile kullanılır
    joinColumns = {@JoinColumn(name = "post_id")}, inverseJoinColumns = {@JoinColumn(name = "tag_id")})
    //post_id post tabledan gelen primary key için, tag_id tag tabledan gelen primary key için,  join table'ımızda, örneğimizde post_tag_rel, columnları isimlendirme
    private Set<Tag> tags=new HashSet<>();




    public Post(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
