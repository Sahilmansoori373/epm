package com.management.performance.employee.EPM.model.feedbackSurvey;

import com.management.performance.employee.EPM.model.employee.Designation;
import com.management.performance.employee.EPM.model.performanceSurvey.PerformanceSurvey;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class FeedbackSurveyAudience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackSurveyaudienceId;
    @ManyToOne
    @JoinColumn(name = "feedback_survey_id")
    private FeedbackSurvey feedbackSurvey;

    @ManyToOne
    @JoinColumn(name = "target_designation_id")
    private Designation designation;
}