package src.main.java.br.com.alura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import src.main.java.br.com.alura.modelo.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {


    Course findByNome(String nome);

}
