package com.management.performance.employee.EPM.model.feedbackSurvey;

import com.management.performance.employee.EPM.model.performanceSurvey.PerformanceSurveyQuestion;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class FeedbackSurveyAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackSurveyAnswerId;
    @ManyToOne
    @JoinColumn(name = "feedback_survey_question_id")
    private FeedbackSurveyQuestion feedbackSurveyQuestion;

    private String Answer;

}
