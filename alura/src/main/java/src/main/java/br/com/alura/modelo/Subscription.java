package src.main.java.br.com.alura.modelo;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import src.main.java.br.com.alura.dto.UserIdDto;

@Builder
@Getter
@Setter
public class Subscription {

	 private Long id;
	 private Long course_id;
	 private Long user_id;
	 private double progress;
	 private String status;
	 private LocalDateTime created_at;
	 private LocalDateTime updated_at;
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Long.valueOf(id) == null) ? 0 : Long.valueOf(id).hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Certificate other = (Certificate) obj;
		if (Long.valueOf(id) == null) {
			if (Long.valueOf(other.getId()) != null)
				return false;
		} else if (id != (other.getId()))
			return false;
		return true;
	}




}
