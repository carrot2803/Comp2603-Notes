import java.util.ArrayList;

public class StationSimulation {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min + 1)) + min);
    }

    public static void populateVehicles(ArrayList<Vehicle> vehicles) {
        for (int i = 0; i < 10; i++) {
            int length = getRandomNumber(1, 100);
            int width = getRandomNumber(1, 100);
            int breadth = getRandomNumber(1, 100);
            int classification = getRandomNumber(1, 100);

            Vehicle vehicle = new Vehicle(length, width, breadth, classification);
            vehicles.add(vehicle);
            System.out.println(vehicle.toString());
        }
    }

    public static void populateDrivers(ArrayList<VehicleDriver> arr) {
        String[] names = { "Lou", "Bob", "Drew", "Tom", "Murphy" };
        for (int i = 0; i < 5; i++)
            arr.add(new VehicleDriver(names[i]));
    }

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        populateVehicles(vehicles);
        ArrayList<VehicleDriver> drivers = new ArrayList<>();
        populateDrivers(drivers);

        for (VehicleDriver driver : drivers) {
            int index = getRandomNumber(0, 10);
            Vehicle v = vehicles.get(index);
            driver.addVehicle(v);
        }
    }

}
