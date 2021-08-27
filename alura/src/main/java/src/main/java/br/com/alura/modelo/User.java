package src.main.java.br.com.alura.modelo;

import java.time.LocalDateTime;
import src.main.java.br.com.alura.enums.UserRole;

@Builder
@Getter @Setter
public class User {

	 private int id;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private UserRole role;
	 private LocalDateTime created_at;
	 private LocalDateTime updated_at;
	
	public User(int id, String firstName, String lastName, String email, UserRole role, LocalDateTime updated_at) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		this.created_at = LocalDateTime.now();
		this.updated_at = updated_at;
	}

}
