package pl.deen.pogodynka.service;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.deen.pogodynka.model.Weather;

@Service
@NoArgsConstructor
public class WeatherService {

    @Value("${app-properties.appid}")
    private String appid;

    public Weather getWeatherByTownName(String townName) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + townName
                + "&units=metric&lang=pl&appid="
                + appid;
        Weather weather = restTemplate.getForObject(url, Weather.class);
        weather.setImage("https://openweathermap.org/themes/openweathermap/assets/vendor/owm/img/widgets/"
                + weather.getDesc().get(0).getIcon()
                + ".png");
        return weather;
    }

}
