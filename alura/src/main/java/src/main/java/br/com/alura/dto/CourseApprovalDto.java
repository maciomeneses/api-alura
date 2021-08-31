package src.main.java.br.com.alura.dto;

import lombok.Builder;
import lombok.Getter;
import src.main.java.br.com.alura.modelo.Course;
import src.main.java.br.com.alura.modelo.CourseApproval;

@Getter


public class CourseApprovalDto {

    private Long id;
    private Long approvedBy;
    public CourseApprovalDto(CourseApproval courseApproval){
        id=courseApproval.getId();
        approvedBy = courseApproval.getCreatedBy();

    }


}
