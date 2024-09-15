package com.management.performance.employee.EPM.model.performanceSurvey;

import com.management.performance.employee.EPM.model.employee.Employee;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PerformanceSurveyResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long performanceSurveyResponseId;
    @ManyToOne
    @JoinColumn(name = "performance_survey_answer_id")
    private PerformanceSurveyAnswers performanceSurveyAnswers;
    @ManyToOne
    @JoinColumn(name = "performance_survey_question_id")
    private PerformanceSurveyQuestion performanceSurveyQuestion;
    @ManyToOne
    @JoinColumn(name = "performance_survey_id")
    private PerformanceSurvey performanceSurvey ;
    private Boolean isReponded;
    private String responseDate;

    @ManyToOne
    @JoinColumn(name = "responder_id", nullable = true)
    private Employee responder;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = true)
    private Employee subject;


}

