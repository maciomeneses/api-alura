package src.main.java.br.com.alura.dto;

import src.main.java.br.com.alura.modelo.Course;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CourseDetails {

    private String name;
    private String category;
    private int workload;
    private String status;
    private Boolean hasCertificate;
    private double evaluation;
    private LocalDateTime updatedAt;

    public CourseDetails(Course course) {
        this.name = getName();
        this.category = course.getCategory();
        this.workload = course.getWorkload();
        this.status = course.getStatus();
        this.hasCertificate = course.getHasCertificate();
        this.evaluation = course.getEvaluation();
        this.updatedAt = course.getUpdatedAt();
    }
}
