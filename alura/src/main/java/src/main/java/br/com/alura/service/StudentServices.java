package src.main.java.br.com.alura.service;

import src.main.java.br.com.alura.dto.*;
import src.main.java.br.com.alura.modelo.Course;
import src.main.java.br.com.alura.modelo.Student;

public class StudentServices {

        public void courseSearch(String name) {
                CourseStorageService.showCourses(name);
        }

        public void courseWatch(CourseWatchDTO courseWatchDTO) {

        }

        public void courseSubscribe(CourseSubscribeDTO courseSubscribeDTO, StudentDto studentDto) { //receberá o id do aluno pela url

                if(courseSubscribeDTO.getUserId().equals(studentDto.getId())){
                        //devolver erro
                } ;
                //passa parametro para o dao


        }

}
