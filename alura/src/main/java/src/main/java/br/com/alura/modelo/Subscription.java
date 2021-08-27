package src.main.java.br.com.alura.modelo;

import java.time.LocalDateTime;

import src.main.java.br.com.alura.dto.UserIdDto;

@Builder
@Getter @Setter
public class Subscription {

	 private int id;
	 private int course_id;
	 private int user_id;
	 private double progress;
	 private String status;
	 private LocalDateTime created_at;
	 private LocalDateTime updated_at;
	
	public Subscription(int id, int course_id, UserIdDto user, double progress, String status, LocalDateTime created_at,LocalDateTime updated_at) {
		this.id = id;
		this.course_id = course_id;
		this.user_id = user.getId();
		this.progress = progress;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

}
