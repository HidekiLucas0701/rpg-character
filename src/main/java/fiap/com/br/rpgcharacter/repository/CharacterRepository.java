package fiap.com.br.rpgcharacter.repository;

import fiap.com.br.rpgcharacter.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
