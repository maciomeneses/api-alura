package src.main.java.br.com.alura.dto;

import lombok.Builder;
import lombok.Getter;
import src.main.java.br.com.alura.modelo.Course;


@Getter
@Builder
public class CourseIdDto {

    private Long id;

    public CourseIdDto(Course course){
        id=course.getId();
    }

}
