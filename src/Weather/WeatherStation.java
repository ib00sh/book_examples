package Weather;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
       // StatisticsDispaly statisticsDispaly = new StatisticsDispaly(weatherData);
      //  ForecastDisplay forecastDisplay = new ForecastDisplay (weatherData);

        weatherData.setMesurements(80, 65, 30.4f);
        weatherData.setMesurements(82, 70, 29.2f);
        weatherData.setMesurements(78, 90, 29.2f);
    }
}
