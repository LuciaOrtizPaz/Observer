public class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Current Temperature: " + temperature + "°C");
    }
}