package solutions.mundovirtual.infraestructure.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import solutions.mundovirtual.domain.Weather;
import solutions.mundovirtual.infraestructure.service.InMemoryWeatherRepository;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
final class WeatherControllerTest {

	@InjectMocks
	private WeatherController weatherController;

	@Mock
	private InMemoryWeatherRepository service;

	@Test
	void getWeather() {
		Weather weatherMock = new Weather();
		weatherMock.setMinTemperature(15);
		weatherMock.setMaxTemperature(30);
		weatherMock.setStatus("sunny");
		when(service.findOne()).thenReturn(weatherMock);

		Weather weatherResult = weatherController.getWeather();

		verify(service, times(1)).findOne();
	}
}