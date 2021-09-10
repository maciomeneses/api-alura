package src.main.java.br.com.alura.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import src.main.java.br.com.alura.controller.dto.CourseDetails;
import src.main.java.br.com.alura.controller.dto.CourseIdDto;
import src.main.java.br.com.alura.controller.dto.PageCourseIdDto;
import src.main.java.br.com.alura.model.Course;
import src.main.java.br.com.alura.repository.CourseRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;


@Service
public class CourseService {


    @Autowired
    private CourseRepository courseRepository;

    private static Collection<CourseDetails> list = new ArrayList<CourseDetails>();

    public static void addCourse(CourseDetails course) {
        list.add(course);
    }

    public static Collection<CourseDetails> showCourses(String name) {
        return list.stream().filter(course -> course.getName().startsWith(name)).collect(Collectors.toUnmodifiableList());
    }

    public static Page<CourseIdDto> converter(Page<Course> courses) {
        return courses.map(CourseIdDto::new);
    }

    public Page<CourseIdDto> listCourses(String nomeCurso, Pageable paginacao) {

        if (nomeCurso == null) {
            PageCourseIdDto pageCourseIdDto  = new PageCourseIdDto();
            Page<Course> courses = courseRepository.findAll(paginacao);
            pageCourseIdDto.setCourses(courses);
            return converter(courses);
        } else {
            PageCourseIdDto pageCourseIdDto  = new PageCourseIdDto();
            Page<Course> courses = courseRepository.findByName(nomeCurso, paginacao);
            pageCourseIdDto.setCourses(courses);
            return converter(courses);
        }

    }


}
