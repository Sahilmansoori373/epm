package com.management.performance.employee.EPM.model.employee;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Skill {

//    skills_id int [primary key]
//    employee_id int
//    proficiency varchar
//    description varchar

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee ;

}
