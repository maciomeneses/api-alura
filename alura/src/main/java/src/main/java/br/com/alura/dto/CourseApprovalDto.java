package src.main.java.br.com.alura.dto;

import src.main.java.br.com.alura.modelo.CourseApproval;

public class CourseApprovalDto {

    private Long id;

    public CourseApprovalDto(CourseApproval courseApproval) {
        this.id = courseApproval.getId();
    }

}
