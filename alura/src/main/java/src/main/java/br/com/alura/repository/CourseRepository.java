package src.main.java.br.com.alura.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import src.main.java.br.com.alura.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {


    @Query(value = "SELECT * FROM Accounts WHERE Username LIKE '%nome%'")
    Page<Course> findByString(Pageable pageable);


    @Query(value = "SELECT u FROM Course u ORDER BY id")
    Page<Course> findAllCoursesWithPagination(Pageable pageable);


    Page<Course> findByCourseName(String name, Pageable pageable);


}
