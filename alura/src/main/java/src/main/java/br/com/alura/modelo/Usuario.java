package src.main.java.br.com.alura.modelo;

import java.util.Date;

public class Usuario {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String role;
	private Date created_at;
	private Date updated_at;
	
	public Usuario(int id, String firstName, String lastName, String email, String role, Date created_at,Date updated_at) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		this.created_at = created_at;
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

	public Date getCreated_at() {
		return created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}
	
	
	
}
