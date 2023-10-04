package eus.ferpinan.gamelist.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@EqualsAndHashCode
public class GameError {
    @JsonProperty("code")
    private String code;
    @JsonProperty("internal_message")
    private String internalMessage;
    @JsonProperty("moreInfo")
    private List<Object> moreInfo;
}
