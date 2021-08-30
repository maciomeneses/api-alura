package src.main.java.br.com.alura.dto;

import lombok.Getter;
import src.main.java.br.com.alura.modelo.Student;

@Getter
public class StudentDto {

    Long id;

    public StudentDto(Student student){
        id= student.getId();

    }


}
