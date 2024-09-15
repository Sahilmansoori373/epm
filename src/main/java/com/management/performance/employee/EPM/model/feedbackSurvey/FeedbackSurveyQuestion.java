package com.management.performance.employee.EPM.model.feedbackSurvey;

import com.management.performance.employee.EPM.model.performanceSurvey.PerformanceSurvey;
import jakarta.persistence.*;

public class FeedbackSurveyQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackSurveyQuestionId;
    @ManyToOne
    @JoinColumn(name = "feedback_survey_id")
    private FeedbackSurvey feedbackSurvey;
    private String question;
}