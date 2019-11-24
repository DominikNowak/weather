package pl.deen.pogodynka.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.deen.pogodynka.model.Weather;

@Service
@NoArgsConstructor
public class WeatherService {

    public Weather getWeatherByTownName(String townName) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + townName + "&units=metric&appid=1a1c93e99537b52f1b9bc26a90fe61ba&lang=pl";
        Weather weather = restTemplate.getForObject(url, Weather.class);
        weather.setImage("https://openweathermap.org/themes/openweathermap/assets/vendor/owm/img/widgets/" + weather.getDesc().get(0).getIcon() + ".png");
        return weather;
    }

}
