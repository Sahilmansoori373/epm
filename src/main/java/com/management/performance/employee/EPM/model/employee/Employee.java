package com.management.performance.employee.EPM.model.employee;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String name;
    private String email;
    private String phone_no;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = true)
    private Department department;
    @ManyToOne
    @JoinColumn(name = "designation_id", nullable = true)
    private Designation designation;
    @ManyToOne
    @JoinColumn(name = "project_id", nullable = true)
    private Project project;

    @ManyToOne
    @JoinColumn(name = "projectManager_id")
    private Employee projectManager;

    @ManyToOne
    @JoinColumn(name = "hrManager_id")
    private Employee hrManager;

    @ManyToOne
    @JoinColumn(name = "teamLead_id")
    private Employee teamLead;

}
