package com.management.performance.employee.EPM.model.performanceSurvey;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PerformanceSurveyQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long performanceSurveyQuestionId;
    @ManyToOne
    @JoinColumn(name = "performance_survey_id")
    private PerformanceSurvey performanceSurvey;
    private String question;
}
