package src.main.java.br.com.alura.modelo;

import java.time.LocalDateTime;

import src.main.java.br.com.alura.enums.UserRole;

public class Student extends User{
	 	
	public Student(int id, String firstName, String lastName, String email, UserRole role,	LocalDateTime updated_at) {
		User user =  User.builder()
				.role(UserRole.STUDENT)
				.firstName(firstName)
				.lastName(lastName)
				.id(id)
				.created_at(LocalDateTime.now())
				.updated_at(LocalDateTime.now())
				.build();
	}

}
