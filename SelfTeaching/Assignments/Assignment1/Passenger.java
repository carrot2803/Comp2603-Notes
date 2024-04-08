// import java.util.Random;

// public class Passenger {
// private String passportNumber;
// private String flightNo;
// private String firstName;
// private String lastName;
// private int numLuggage;
// private char cabinClass;

// public Passenger(String passportNumber, String firstName, String lastName,
// String flightNo) {
// this.passportNumber = passportNumber;
// this.firstName = firstName;
// this.lastName = lastName;
// this.flightNo = flightNo;
// this.numLuggage = new Random().nextInt(10);
// assignRandomCabinClass();
// }

// // mutators
// public void assignRandomCabinClass() {
// char[] cabinClasses = { 'F', 'B', 'P', 'E' };
// Random random = new Random();
// int randomIndex = random.nextInt(cabinClasses.length);
// this.cabinClass = cabinClasses[randomIndex];
// }

// // accessors

// public String getPassportNumber() {
// return passportNumber;
// }

// public String getFlightNo() {
// return flightNo;
// }

// public String getFirstName() {
// return firstName;
// }

// public String getLastName() {
// return lastName;
// }

// public int getNumLuggage() {
// return numLuggage;
// }

// public char getCabinClass() {
// return cabinClass;
// }

// public String toString() {
// return "PP NO. " + getPassportNumber() + " NAME: "
// + getFirstName().charAt(0) + "." +
// getLastName().toUpperCase() +
// " NUMLUGGAGE: " + getNumLuggage()
// + " CLASS: " + getCabinClass();
// }

// }
