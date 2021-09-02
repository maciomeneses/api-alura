package src.main.java.br.com.alura.service;

import src.main.java.br.com.alura.dto.CourseNameDTO;
import src.main.java.br.com.alura.dto.CourseSubscribeDTO;
import src.main.java.br.com.alura.dto.CourseWatchDTO;
import src.main.java.br.com.alura.dto.StudentDto;

public class StudentServices {

        public void courseSearch(String name, CourseNameDTO nameDTO){
                CourseStorageService.showCourses(name);
        }

        public void courseWatch(CourseWatchDTO courseWatchDTO){

        }

        public void courseSubscribe(CourseSubscribeDTO courseSubscribeDTO, StudentDto studentDto){

                if(courseSubscribeDTO.getUserId().equals(studentDto.getId())){
                        //devolver erro
                } ;
                //passa parametro para o dao


        }

}
