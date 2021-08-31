package src.main.java.br.com.alura.dto;

import lombok.Getter;
import src.main.java.br.com.alura.model.Subscription;
@Getter
public class CourseSubscribeDTO {

    Long userId;

    public CourseSubscribeDTO(Subscription subscription){
        userId = subscription.getUser_id();
    }


}
