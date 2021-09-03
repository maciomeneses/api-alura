package src.main.java.br.com.alura.service;

import src.main.java.br.com.alura.dto.*;
import src.main.java.br.com.alura.modelo.Course;
import src.main.java.br.com.alura.modelo.Student;
import src.main.java.br.com.alura.dto.CourseNameDTO;
import src.main.java.br.com.alura.dto.CourseSubscribeDTO;
import src.main.java.br.com.alura.dto.CourseWatchDTO;
import src.main.java.br.com.alura.dto.StudentDto;

public class StudentServices {

        public void courseSearch(String name) {
                CourseStorageService.showCourses(name);
        }

        public void courseWatch(CourseWatchDTO courseWatchDTO) {
                System.out.println(courseWatchDTO);
        }

        public void courseSubscribe(CourseSubscribeDTO courseSubscribeDTO, StudentDto studentDto) { //receberá o id do aluno pela url

                if(courseSubscribeDTO.getUserId().equals(studentDto.getId())){
                        //devolver erro
                } ;
                //passa parametro para o dao


        }

}
