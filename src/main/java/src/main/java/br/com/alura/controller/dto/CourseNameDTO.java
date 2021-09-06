package src.main.java.br.com.alura.controller.dto;



import lombok.Getter;
import src.main.java.br.com.alura.model.Course;

@Getter

public class CourseNameDTO {
    String nome;

    public CourseNameDTO(Course course){
        nome=course.getName();
    }



}
