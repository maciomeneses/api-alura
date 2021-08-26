package src.main.java.br.com.alura.modelo;

import java.time.LocalDateTime;

public class Aluno extends Usuario{

	
	
	public Aluno(int id, String firstName, String lastName, String email, String role,	LocalDateTime updated_at) {
		super(id, firstName, lastName, email, role, updated_at);
	}

}
