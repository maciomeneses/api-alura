package src.main.java.br.com.alura.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import src.main.java.br.com.alura.model.Course;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseIdDto {

    private Long id;


    public CourseIdDto(Course course) {
        this.id = course.getId();
    }
}
