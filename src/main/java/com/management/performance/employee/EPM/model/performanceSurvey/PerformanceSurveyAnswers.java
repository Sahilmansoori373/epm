package com.management.performance.employee.EPM.model.performanceSurvey;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class PerformanceSurveyAnswers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long performanceSurveyAnswerId;
    @ManyToOne
    @JoinColumn(name = "performance_survey_question_id")
    private PerformanceSurveyQuestion performanceSurveyQuestion;

    private String Answer;

}
