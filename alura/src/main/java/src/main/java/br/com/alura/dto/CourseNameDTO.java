package src.main.java.br.com.alura.dto;



import lombok.Getter;
import src.main.java.br.com.alura.modelo.Course;

@Getter

public class CourseNameDTO {
    String nome;

    public CourseNameDTO(Course course){
        nome=course.getName();
    }



}
