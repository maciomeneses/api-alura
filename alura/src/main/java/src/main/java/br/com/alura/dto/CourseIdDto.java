package src.main.java.br.com.alura.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.domain.Page;
import src.main.java.br.com.alura.model.Course;


@Getter
@Builder
public class CourseIdDto {

    private Long id;

    public CourseIdDto(Course course) {
        this.id = course.getId();
    }

    public static Page<CourseIdDto> converter(Page<Course> courses) {
        return courses.map(CourseIdDto::new);
    }

}
