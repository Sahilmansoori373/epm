package com.management.performance.employee.EPM.model.employee;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Certificate {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long certificateId;
    private String certificationName;
    private String issuingOrganization;
    private String description;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee ;

}
