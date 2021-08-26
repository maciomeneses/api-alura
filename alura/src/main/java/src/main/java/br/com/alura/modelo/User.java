package src.main.java.br.com.alura.modelo;

import java.time.LocalDateTime;

public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String role;
	private LocalDateTime created_at;
	private LocalDateTime updated_at;
	
	public User(int id, String firstName, String lastName, String email, String role, LocalDateTime updated_at) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		this.created_at = LocalDateTime.now();
		this.updated_at = updated_at;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getRole() {
		return role;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	
	
	
}
