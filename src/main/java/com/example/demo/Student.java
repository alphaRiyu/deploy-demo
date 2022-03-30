package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author Rieugene Basilisco (generieu17@gmail.com)
 * @project demo
 * @created Mar 30, 2022 11:25 PM
 */

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @GeneratedValue(strategy = IDENTITY)
    @Id
    @Column(name = "student_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;
}
