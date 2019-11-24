package pl.deen.pogodynka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.deen.pogodynka.service.WeatherService;

@Controller
public class WeatherController {

    private WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/weather")
    public String getWeatherByTownName(@RequestParam("townName") String townName, Model model) {
        model.addAttribute("weather", weatherService.getWeatherByTownName(townName));
        return "weatherView";
    }
}
