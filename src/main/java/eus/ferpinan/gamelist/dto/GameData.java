package eus.ferpinan.gamelist.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@EqualsAndHashCode
public class GameData {
    @JsonProperty("boxDetails")
    private List<GameDetail> boxDetails;
    @JsonProperty("masterBoxDetails")
    private Object masterBoxDetails;

    // getters and setters
}
