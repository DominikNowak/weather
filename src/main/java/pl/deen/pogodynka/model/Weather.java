package pl.deen.pogodynka.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Weather {

    private Integer id;
    @JsonProperty("name")
    private String townName;
    @JsonProperty("weather")
    private List<Description> desc;
    @JsonProperty("main")
    private MainData mainData;
    @JsonProperty("wind")
    private Wind wind;
    @JsonProperty("clouds")
    private Clouds clouds;
    @JsonProperty("sys")
    private Sys sys;
    private String image;
}
