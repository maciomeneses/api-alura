package src.main.java.br.com.alura.service;

import src.main.java.br.com.alura.controller.dto.CourseApprovalDto;
import src.main.java.br.com.alura.controller.dto.CourseDetails;
import src.main.java.br.com.alura.controller.dto.ManagerDTO;
import src.main.java.br.com.alura.model.Course;

public class ManagerService {

    private Course course;

    public void ApproveCourse(CourseApprovalDto courseApproval, ManagerDTO manager) {

        if(courseApproval.getApprovedBy().equals(manager.getId())){
            //devolver erro
        } ;
            //atualizar valor no banco de dados no course aproval
            //Adiciona o curso aprovado na lista de cursos:
            CourseService.addCourse(new CourseDetails(course));
    }

    public void CreateCourse( Long id,String name, String category,int workload) {
         course = Course.builder().id(id).name(name).category(category).workload(workload).build();
      
        //passar o curso para o banco de dados
    }


}
