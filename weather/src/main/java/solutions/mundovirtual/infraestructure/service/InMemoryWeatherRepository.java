package solutions.mundovirtual.infraestructure.service;

import org.springframework.stereotype.Service;
import solutions.mundovirtual.domain.Weather;
import solutions.mundovirtual.domain.WeatherRepository;

@Service
public class InMemoryWeatherRepository implements WeatherRepository {
	@Override
	public Weather findOne() {
		Weather weather = new Weather();
		weather.setMaxTemperature(10);
		weather.setMinTemperature(8);
		weather.setStatus("cloudy");
		return weather;
	}
}
