package src.main.java.br.com.alura.service;

import src.main.java.br.com.alura.model.Course;

import java.util.ArrayList;
import java.util.Collection;

public class CourseStorageService {

    private static Collection<Course> list = new ArrayList<Course>();

    public static void addCourse(Course course) {
        list.add(course);
    }

    public static Collection<Course> showCourses(String name) {
        int size = name.length();
        return  list.stream().filter(Course.getName().substring(size) == name);
    }

}
