package src.main.java.br.com.alura.model;

import lombok.*;
import src.main.java.br.com.alura.enums.UserRole;

import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {

	 private Long id;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private UserRole role;
	 private LocalDateTime created_at;
	 private LocalDateTime updated_at;





	
}
