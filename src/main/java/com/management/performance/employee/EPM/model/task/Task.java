package com.management.performance.employee.EPM.model.task;

import com.management.performance.employee.EPM.model.employee.Department;
import com.management.performance.employee.EPM.model.employee.Employee;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String taskDetails;
    private String createdYear;

    @ManyToOne
    @JoinColumn(name = "achievement_id", nullable = true)
    private Achievement achievement;

    @ManyToOne
    @JoinColumn(name = "reviewer_id", nullable = true)
    private Employee reviewer;

}
