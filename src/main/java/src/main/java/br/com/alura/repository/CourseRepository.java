package src.main.java.br.com.alura.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import src.main.java.br.com.alura.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {


    //@Query("select t from src.main.java.br.com.alura.model.Course t where t.course.name = ?1" )
    //@Query("select c from Course c where c.name = ?1")
    Page<Course> findByName(String name, Pageable pageable);


}
