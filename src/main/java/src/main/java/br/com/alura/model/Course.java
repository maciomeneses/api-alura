package src.main.java.br.com.alura.model;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
//@Table(name = "COURSE")
public class Course {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     //@Column(name = "name")
     private String name;
     private String category;
     private int workload;
     private String status;
     private Boolean hasCertificate;
     private double evaluation;
     private LocalDateTime createdAt;
     private LocalDateTime updatedAt;



}
