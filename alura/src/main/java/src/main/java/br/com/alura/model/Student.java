package src.main.java.br.com.alura.model;

import java.time.LocalDateTime;
import java.util.HashMap;

import src.main.java.br.com.alura.enums.UserRole;

public class Student extends User{

	HashMap<Integer,Certificate> certificates = new HashMap<Integer, Certificate>();

	public Student(Long id, String firstName, String lastName, String email, UserRole role,	LocalDateTime updated_at) {
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
