package com.utn.utn.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //Convierte tu clase java a una tabla en BD
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    @Id// primary key
    @GeneratedValue //Es como el autoincrement
    private Integer idPersona;

    @NotNull
    private String name;

    @NotNull
    private String lastname;
}


