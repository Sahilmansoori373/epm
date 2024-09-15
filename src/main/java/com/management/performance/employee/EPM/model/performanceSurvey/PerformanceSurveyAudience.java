package com.management.performance.employee.EPM.model.performanceSurvey;

import com.management.performance.employee.EPM.model.employee.Designation;
import com.management.performance.employee.EPM.model.employee.Employee;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class PerformanceSurveyAudience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long performanceSurveyaudienceId;
    @ManyToOne
    @JoinColumn(name = "performance_survey_id")
    private PerformanceSurvey performanceSurvey;

    @ManyToOne
    @JoinColumn(name = "target_designation_id")
    private Designation designation;



}
