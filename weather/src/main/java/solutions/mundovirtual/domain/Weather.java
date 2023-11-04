package solutions.mundovirtual.domain;

import java.util.Objects;

public class Weather {
	private String status;
	private Integer minTemperature;
	private Integer maxTemperature;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(Integer minTemperature) {
		this.minTemperature = minTemperature;
	}

	public Integer getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(Integer maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Weather weather = (Weather) o;
		return Objects.equals(status, weather.status) && Objects.equals(minTemperature, weather.minTemperature) && Objects.equals(maxTemperature, weather.maxTemperature);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, minTemperature, maxTemperature);
	}
}
