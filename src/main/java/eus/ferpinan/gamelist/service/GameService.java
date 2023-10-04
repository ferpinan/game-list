package eus.ferpinan.gamelist.service;

import eus.ferpinan.gamelist.dto.Game;
import eus.ferpinan.gamelist.repository.CexRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

import static eus.ferpinan.gamelist.repository.GameRepository.GAME_SKUS;

@Repository
@RequiredArgsConstructor
@Log4j2
public class GameService {

    private final CexRepository cexRepository;

    public List<Game> getGames() {
        return GAME_SKUS.stream()
                .map(cexRepository::getUrl)
                .map(cexRepository::getGame)
                .collect(Collectors.toList());
    }
}
