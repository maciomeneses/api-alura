package src.main.java.br.com.alura.dto;


import lombok.Getter;
import src.main.java.br.com.alura.model.Manager;

@Getter

public class ManagerDTO {
    String nome;
    Long id;

    public ManagerDTO(Manager manager){
        nome = manager.getFirstName() +" " + manager.getLastName();
        id = manager.getId();
    }


}
