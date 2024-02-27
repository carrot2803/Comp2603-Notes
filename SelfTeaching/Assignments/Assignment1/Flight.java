// import java.time.LocalDateTime;

// public class Flight {
// private String flightNo;
// private String destination;
// private String origin;
// private LocalDateTime flightDate;
// private LuggageManifest manifest;

// public Flight(String flightNo, String destination, String origin,
// LocalDateTime flightDate) {
// this.flightNo = flightNo;
// this.destination = destination;
// this.origin = origin;
// this.flightDate = flightDate;
// this.manifest = new LuggageManifest();
// }

// // mutators
// public String checkInLuggage(Passenger p) {
// if (!this.flightNo.equals(p.getFlightNo()))
// return "Invalid Flight";
// return manifest.addLuggage(p, this);
// }

// // accessors

// public int getAllowedLuggage(char cabinClass) {
// char[] cabinClasses = { 'E', 'P', 'B', 'F' };
// for (int i = 0; i < cabinClasses.length; i++)
// if (cabinClasses[i] == cabinClass)
// return i;
// return -1;
// }

// public String printLuggageManifest() {
// return manifest.toString();
// }

// public String getFlightNo() {
// return flightNo;
// }

// public String getDestination() {
// return destination;
// }

// public String getOrigin() {
// return origin;
// }

// public LocalDateTime getFlightDate() {
// return flightDate;
// }

// public LuggageManifest getManifest() {
// return manifest;
// }

// public String toString() {
// return "Flight No: " + getFlightNo() +
// " DESTINATION: " + getDestination() +
// " ORIGIN: " + getOrigin() +
// " " + getFlightDate().toString();
// }
// }
