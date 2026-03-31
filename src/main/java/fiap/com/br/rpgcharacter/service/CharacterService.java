package fiap.com.br.rpgcharacter.service;

import fiap.com.br.rpgcharacter.entity.Character;
import fiap.com.br.rpgcharacter.repository.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public Character addCharacter(Character character){
        return characterRepository.save(character);
    }

    public List<Character> listCharacters(){
        return characterRepository.findAll();
    }
}
