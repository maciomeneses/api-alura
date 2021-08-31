package src.main.java.br.com.alura.dto;

import lombok.Builder;
import lombok.Getter;
import src.main.java.br.com.alura.modelo.User;


@Getter

public class UserIdDto {

	private Long id;

	public UserIdDto(User user){
		id=user.getId();
	}
			
}
