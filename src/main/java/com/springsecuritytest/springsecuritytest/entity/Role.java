package com.springsecuritytest.springsecuritytest.entity;


import jakarta.persistence.*;
//import javax.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Specify the name of the existing column
    private Integer id;

    private String name;

    public Role() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

//package com.springsecuritytest.springsecuritytest.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_role") // Specify the name of the existing column
//    private Integer id;
//
//    private String name;
//
//    // Constructors, getters, and setters as before
//}