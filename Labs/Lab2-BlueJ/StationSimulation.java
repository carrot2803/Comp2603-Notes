// import java.util.ArrayList;
// import java.util.Scanner;
// import java.io.File;
// import java.io.FileNotFoundException;

// public class StationSimulation {
//     private static int toInt(String s) {
//         return Integer.parseInt(s);
//     }

//     private static Vehicle createVehicle(String[] d) {
//         return new Vehicle(toInt(d[0]), toInt(d[1]), toInt(d[2]));
//     }

//     private static void readFiles(ArrayList<Vehicle> vehicles) {
//         File file = new File("vehicles.txt");
//         try {
//             Scanner scanner = new Scanner(file);
//             while (scanner.hasNextLine()) {
//                 String line = scanner.nextLine();
//                 Vehicle v = createVehicle(line.split(","));
//                 vehicles.add(v);
//             }
//             scanner.close();
//         } catch (FileNotFoundException e) {
//             System.out.println("File not found " + e.getMessage());
//         }
//     }

//     public static void main(String[] args) {
//         FuelStation fuelStation = new FuelStation();
//         ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
//         readFiles(vehicles);

//         for (Vehicle vehicle : vehicles) {
//             System.out.println(fuelStation.toString());
//             System.out.println(vehicle.toString());
//             boolean filledUp = fuelStation.dispense(vehicle.getFuelType(), vehicle.getTankCapacity());
//             System.out.println("Filled up: " + filledUp);
//             System.out.println(fuelStation.toString());
//         }
//     }
// }