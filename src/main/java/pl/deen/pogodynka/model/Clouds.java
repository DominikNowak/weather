package pl.deen.pogodynka.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Clouds {
    @JsonProperty("all")
    private Integer all;
}
