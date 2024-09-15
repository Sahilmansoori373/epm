package com.management.performance.employee.EPM.model.feedbackSurvey;

import com.management.performance.employee.EPM.model.employee.Employee;
import com.management.performance.employee.EPM.model.performanceSurvey.PerformanceSurvey;
import com.management.performance.employee.EPM.model.performanceSurvey.PerformanceSurveyAnswers;
import com.management.performance.employee.EPM.model.performanceSurvey.PerformanceSurveyQuestion;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class FeedbackSurveyResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackSurveyResponseId;
    @ManyToOne
    @JoinColumn(name = "feedback_survey_answer_id")
    private FeedbackSurveyAnswer feedbackSurveyAnswer;
    @ManyToOne
    @JoinColumn(name = "feedback_survey_question_id")
    private FeedbackSurveyQuestion feedbackSurveyQuestion;
    @ManyToOne
    @JoinColumn(name = "feedback_survey_id")
    private FeedbackSurvey feedbackSurvey;
    private Boolean isReponded;
    private String responseDate;

    @ManyToOne
    @JoinColumn(name = "responder_id", nullable = true)
    private Employee responder;

}