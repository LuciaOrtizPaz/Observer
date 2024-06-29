public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(weatherWarning);

        System.out.println("Setting temperature to 25°C");
        weatherStation.setTemperature(25);

        System.out.println("Setting temperature to 35°C");
        weatherStation.setTemperature(35);
    }
}
