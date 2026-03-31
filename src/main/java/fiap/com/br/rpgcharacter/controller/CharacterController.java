package fiap.com.br.rpgcharacter.controller;

import fiap.com.br.rpgcharacter.dto.CharacterRequest;
import fiap.com.br.rpgcharacter.entity.Character;
import fiap.com.br.rpgcharacter.service.CharacterService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/character")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Character addCharacter(@RequestBody @Valid CharacterRequest characterRequest){
        return characterService.addCharacter(characterRequest.toEntity());
    }

    @GetMapping
    public List<Character> listCharacters(){
        return characterService.listCharacters();
    }
}
