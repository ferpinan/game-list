package eus.ferpinan.gamelist.repository;

import eus.ferpinan.gamelist.dto.Game;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
@RequiredArgsConstructor
@Log4j2
public class CexRepository {
    private final String API_URL = "https://wss2.cex.es.webuy.io/v3/boxes/%s/detail";

    private final RestTemplate restTemplate;

    @Cacheable("games")
    public Game getGame(String url){
        log.info("Requesting url: {}", url);
        return restTemplate.getForObject(url, Game.class);
    }

    public String getUrl(String sku){
        return String.format(API_URL, sku);
    }
}
