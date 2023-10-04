package eus.ferpinan.gamelist.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@EqualsAndHashCode
public class GameResponse {
    @JsonProperty("ack")
    private String ack;
    @JsonProperty("data")
    private GameData data;
    @JsonProperty("error")
    private GameError error;
}
