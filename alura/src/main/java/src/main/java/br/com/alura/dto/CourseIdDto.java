package br.com.alura.forum.controller.dto;

import br.com.alura.forum.modelo.Curso2;

public class CourseIdDto {

    private Long id;

    public CourseIdDto(Curso2 curso) {
        this.id = curso.getId();
    }
}
