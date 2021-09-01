package src.main.java.br.com.alura.service;

import src.main.java.br.com.alura.dto.CourseDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class CourseStorageService {

    private static Collection<CourseDetails> list = new ArrayList<CourseDetails>();

    public static void addCourse(CourseDetails course) {
        list.add(course);
    }

    public static Collection<CourseDetails> showCourses(String name) {
        return list.stream().filter(course -> course.getName().startsWith(name)).collect(Collectors.toUnmodifiableList());
    }

}
