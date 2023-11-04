package solutions.mundovirtual.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import solutions.mundovirtual.domain.Weather;
import solutions.mundovirtual.infraestructure.service.InMemoryWeatherRepository;

@RestController
public class WeatherController {
	@Autowired
	private InMemoryWeatherRepository weatherService;
	@GetMapping("/weather")
	public Weather getWeather(){
		return weatherService.findOne();
	}
}
