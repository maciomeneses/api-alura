package src.main.java.br.com.alura.controller.dto;

import lombok.Getter;
import src.main.java.br.com.alura.model.Student;

@Getter
public class StudentDto {

    Long id;

    public StudentDto(Student student){
        id = student.getId();

    }


}
