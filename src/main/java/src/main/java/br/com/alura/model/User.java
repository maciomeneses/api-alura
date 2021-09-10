package src.main.java.br.com.alura.model;

import lombok.*;
import javax.persistence.Entity;
import src.main.java.br.com.alura.enums.UserRole;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class User {

	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private UserRole role;
	 private LocalDateTime created_at;
	 private LocalDateTime updated_at;





	
}
