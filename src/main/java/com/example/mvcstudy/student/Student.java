package com.example.mvcstudy.student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student")
@Entity(name= "Student")
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    @Getter private Integer id;

    @Getter @Setter private String matricula;

    @Getter @Setter private String nome;



}
