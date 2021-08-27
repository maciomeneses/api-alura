package src.main.java.br.com.alura.modelo;

import java.time.LocalDateTime;

import src.main.java.br.com.alura.enums.UserRole;

public class Student extends User{
	 	
	public Student(int id, String firstName, String lastName, String email, UserRole role,	LocalDateTime updated_at) {
		super(id, firstName, lastName, email, role, updated_at);
	}

}
