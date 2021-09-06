package src.main.java.br.com.alura.dto;

import lombok.Getter;
import src.main.java.br.com.alura.model.CourseApproval;

@Getter


public class CourseApprovalDto {

    private Long id;
    private Long approvedBy;
    public CourseApprovalDto(CourseApproval courseApproval){
        id=courseApproval.getId();
        approvedBy = courseApproval.getCreatedBy();

    }


}
