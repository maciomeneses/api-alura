package src.main.java.br.com.alura.dto;

import src.main.java.br.com.alura.modelo.Course;

public class CourseIdDto {

    private Long id;

    public CourseIdDto(Course curso) {
        this.id = curso.getId();
    }
}
