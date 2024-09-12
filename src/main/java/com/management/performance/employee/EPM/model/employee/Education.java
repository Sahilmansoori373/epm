package com.management.performance.employee.EPM.model.employee;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Education {
/*

education_id int [primary key]
employee_id int
degree varchar
field_of_education varchar
institution_name varchar
description varchar
*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationId;
    private String degree;
    private String fieldOfEducation;
    private String description;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee ;



}
