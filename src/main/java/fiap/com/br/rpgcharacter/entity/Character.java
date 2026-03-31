package fiap.com.br.rpgcharacter.entity;

import fiap.com.br.rpgcharacter.enums.CharacterClass;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Builder
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private CharacterClass characterClass;
    private Integer level;
    private Double hp;
    private LocalDate createdAt;
    private String characterCode;
}
