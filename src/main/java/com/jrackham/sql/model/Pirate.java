package com.jrackham.sql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "pirate")
public class Pirate {
    @Id
    @Column(name = "id_pirate")
    private Integer id;
    @Column(name = "pirate_name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "height")
    private float height;
}
