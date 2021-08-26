package src.main.java.br.com.alura.dto;

import src.main.java.br.com.alura.modelo.User;

public class UserIdDto {

	private int id;

	public UserIdDto(User user) {
		this.id = user.getId();
	}

	public int getId() {
		return id;
	}
			
}
