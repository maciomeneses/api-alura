package src.main.java.br.com.alura.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import src.main.java.br.com.alura.model.Course;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageCourseIdDto {

    private Page<CourseIdDto> courses;


}
