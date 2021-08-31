package src.main.java.br.com.alura.dto;

import lombok.Getter;
import src.main.java.br.com.alura.model.User;


@Getter

public class UserIdDto {

	private Long id;

	public UserIdDto(User user){
		id=user.getId();
	}
			
}
