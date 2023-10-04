package eus.ferpinan.gamelist.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@EqualsAndHashCode
public class ImageUrls {
    @JsonProperty("large")
    private String large;
    @JsonProperty("medium")
    private String medium;
    @JsonProperty("small")
    private String small;
    @JsonProperty("masterBoxLarge")
    private Object masterBoxLarge;
    @JsonProperty("masterBoxMedium")
    private Object masterBoxMedium;
    @JsonProperty("masterBoxSmall")
    private Object masterBoxSmall;
}
