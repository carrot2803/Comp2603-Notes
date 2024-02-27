// import java.io.File;
// import java.time.LocalDateTime;
// import java.util.Scanner;

// public class LuggageManagementSystem {
// public static void main(String[] args) {
// processPassengerFile();
// processFlightFile();
// createFlightsAndPassengers();
// }

// private static void processPassengerFile() {
// try {
// Scanner scanner = new Scanner(new File("passengers.txt"));
// String[] pps = new String[25];
// String[] firstNames = new String[25];
// String[] lastNames = new String[25];
// String[] passFlightNo = new String[25];
// Passenger p;

// int count = 0;
// while (scanner.hasNext() && count < 25) {
// pps[count] = scanner.next();
// firstNames[count] = scanner.next();
// lastNames[count] = scanner.next();
// passFlightNo[count] = scanner.next();

// p = new Passenger(pps[count], firstNames[count], lastNames[count],
// passFlightNo[count]);
// System.out.println(p);
// count++;
// }
// scanner.close();
// } catch (Exception e) {
// e.printStackTrace();
// }
// }

// private static void processFlightFile() {
// LocalDateTime d = LocalDateTime.of(2023, 1, 23, 10, 00, 00);

// try {
// Scanner scanner = new Scanner(new File("flights.txt"));
// String[] flightNo = new String[25];
// String[] dest = new String[25];
// String[] origin = new String[25];
// Flight f;

// int count = 0;
// while (scanner.hasNext() && count < 25) {
// flightNo[count] = scanner.next();
// dest[count] = scanner.next();
// origin[count] = scanner.next();

// f = new Flight(flightNo[count], dest[count], origin[count], d);
// System.out.println(f.printLuggageManifest());
// count++;
// }
// scanner.close();

// } catch (Exception e) {
// e.printStackTrace();
// }
// }

// private static void createFlightsAndPassengers() {
// LocalDateTime d2 = LocalDateTime.of(2023, 1, 23, 10, 00, 00);
// Flight yyz = new Flight("BW600", "POS", "YYZ", d2);

// System.out.println(yyz);
// Passenger p;
// String[] pps = { "TA890789", "BA321963", "LA445241" };
// String[] firstNames = { "Joe", "Lou", "Sid" };
// String[] lastNames = { "Bean ", " Deer", "Hart" };

// for (int i = 0; i < 3; i++) {
// p = new Passenger(pps[i], firstNames[i], lastNames[i], "BW600");
// System.out.println(p);
// System.out.println(yyz.checkInLuggage(p));
// }
// System.out.println(yyz.printLuggageManifest());
// }
// }
