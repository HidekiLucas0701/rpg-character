package fiap.com.br.rpgcharacter.entity;

import fiap.com.br.rpgcharacter.enums.CharacterClass;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Character {

    private String name;
    private String email;
    private Integer age;
    private CharacterClass characterClass;
    private Integer level;
    private Double hp;
    private LocalDate createdAt;
    private String characterCode;
}
