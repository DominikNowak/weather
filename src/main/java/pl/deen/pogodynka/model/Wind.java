package pl.deen.pogodynka.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Wind {

    @JsonProperty("speed")
    private Integer speed;
}
