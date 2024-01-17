// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.ArrayList;
// import java.util.Scanner;

// public class StationSimulation {

// private static void readFile(ArrayList<Vehicle> vehicles) {
// try {
// File file = new File("vehicle.txt");
// Scanner scanner = new Scanner(file);

// while (scanner.hasNextLine()) {
// String line = scanner.nextLine();
// String[] s = line.split(",");
// int length = Integer.parseInt(s[0]);
// int width = Integer.parseInt(s[1]);
// int breadth = Integer.parseInt(s[2]);
// final Vehicle vehicle = new Vehicle(length, width, breadth, 0);
// vehicles.add(vehicle);
// System.out.println(line);
// }
// scanner.close();
// } catch (FileNotFoundException e) {
// System.out.println("File not found " + e.getMessage());
// }

// }

// public static void main(String[] args) {
// FuelStation fuelStation = new FuelStation();
// ArrayList<Vehicle> vehicles = new ArrayList<>();
// readFile(vehicles);

// for (Vehicle vehicle : vehicles) {
// System.out.println(fuelStation.toString());
// System.out.println(vehicle.toString());
// boolean filledUp = fuelStation.dispense(vehicle.getFuelType(),
// vehicle.getTankCapacity());
// System.out.println("Filled up: " + filledUp);
// System.out.println(fuelStation.toString());
// }

// }
// }
