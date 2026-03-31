package fiap.com.br.rpgcharacter.dto;

import fiap.com.br.rpgcharacter.entity.Character;
import fiap.com.br.rpgcharacter.enums.CharacterClass;
import jakarta.validation.constraints.*;

import java.time.LocalDate;


public record CharacterRequest (

        @NotBlank(message = "Name is required")
        @Size(min = 3, max = 50)
        String name,

        @NotBlank(message = "Email is required")
        @Email
        String email,

        @NotNull(message = "Age is required")
        @Min(12)
        @Max(120)
        Integer age,

        @NotNull(message = "Class is required")
        CharacterClass characterClass,

        @NotNull(message = "Level is required")
        @Min(1)
        @Max(100)
        Integer level,

        @NotNull(message = "Hp is required")
        @Min(0)
        Double hp,

        @NotNull(message = "Creation date is required")
        @Past
        LocalDate createdAt,

        @NotBlank(message = "Code is required")
        @Pattern(regexp = "^[A-Z]{4}-\\d{4}$", message = "ABCD-1234")
        String characterCode
) {
        public Character toEntity(){
            return Character.builder()
                    .name(name)
                    .email(email)
                    .age(age)
                    .characterClass(characterClass)
                    .level(level)
                    .hp(hp)
                    .createdAt(createdAt)
                    .characterCode(characterCode)
                    .build();
        }
}
