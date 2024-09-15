package com.management.performance.employee.EPM.model.feedbackSurvey;

import com.management.performance.employee.EPM.model.employee.Designation;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class FeedbackSurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackSurveyId;
    private String title;
    private String description;
    private String createDate;
    private String launchDate;
    private String endDate;
    @ManyToOne
    @JoinColumn(name = "subject_designation_id")
    private Designation subjectDesignation;

}
