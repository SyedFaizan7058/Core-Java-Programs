package com._22_jan;

interface WeatherStationInterface {

	void recordTemperature(Double temperature);

	void recordHumidity(Integer humidity);

	void recordWeatherConditions(String conditions);

	void displayWeatherReport();

}

class WeatherStation implements WeatherStationInterface {

	private String location;
	private Double temperature;
	private Integer humidity;
	private String weatherConditions;

	public WeatherStation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public void recordTemperature(Double temperature) {
		// TODO Auto-generated method stub
		this.temperature = temperature;

	}

	@Override
	public void recordHumidity(Integer humidity) {
		// TODO Auto-generated method stub
		this.humidity = humidity;

	}

	@Override
	public void recordWeatherConditions(String conditions) {
		// TODO Auto-generated method stub
		this.weatherConditions = conditions;

	}

	@Override
	public void displayWeatherReport() {

		System.out.println("Humidity :" + humidity);
		System.out.println("Temprature is :" + temperature);
		System.out.println("Conditions :" + weatherConditions);

	}

}

public class Program2 {

	public static void main(String[] args) {

		WeatherStation w = new WeatherStation("Hydrabad");
		w.recordTemperature(32.5);
		w.recordHumidity(100);
		w.recordWeatherConditions("Normal");
		w.displayWeatherReport();

	}

}
