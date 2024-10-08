package com.management.performance.employee.EPM.model.performanceSurvey;

import com.management.performance.employee.EPM.model.employee.Designation;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PerformanceSurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long performanceSurveyId;
    private String title;
    private String description;
    private String createDate;
    private String launchDate;
    private String endDate;

}
