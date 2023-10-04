package eus.ferpinan.gamelist.controller;

import eus.ferpinan.gamelist.dto.Game;
import eus.ferpinan.gamelist.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/games")
    public @ResponseBody List<Game> getAllGames() {
        return gameService.getGames();
    }
}
