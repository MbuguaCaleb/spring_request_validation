package com.codewithcaleb.requestvalidation.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "USERS_TBL")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private int userId;

    @Column(unique = true)
    private String name;

    private String email;
    private String mobile;
    private String gender;
    private String age;
    private String nationality;

}
