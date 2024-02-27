// import java.util.ArrayList;

// public class LuggageManifest {
// private ArrayList<LuggageSlip> slips;

// public LuggageManifest() {
// slips = new ArrayList<>();
// }

// public String addLuggage(Passenger p, Flight f) {
// double cost = getExcessLuggageCost(p.getNumLuggage(),
// f.getAllowedLuggage(p.getCabinClass()));
// for (int i = 0; i < p.getNumLuggage(); i++) {
// LuggageSlip newSlip = new LuggageSlip(p, f, "" + cost);
// slips.add(newSlip);
// }
// return "Luggage added successfully. Cost of excess luggage: $" + cost + "\n";
// }

// public double getExcessLuggageCost(int numPieces, int numAllowedPieces) {
// return (numPieces - numAllowedPieces) * 35.00;
// }

// public int allowedLuggage(char cabinClass) {
// char[] cabinClasses = { 'E', 'P', 'B', 'F' };
// for (int i = 0; i < cabinClasses.length; i++)
// if (cabinClasses[i] == cabinClass)
// return i;
// return -1;
// }

// public String getExcessLuggageCostByPassenger(String passportNumber) {
// for (LuggageSlip slip : slips) {
// Passenger p = slip.getOwner();
// if (p.getPassportNumber().equals(passportNumber)) {
// int numAllowedPieces = allowedLuggage(p.getCabinClass());
// return "" + getExcessLuggageCost(p.getNumLuggage(), numAllowedPieces);
// }
// }
// return "No cost";
// }

// public String toString() {
// String output = "\nLUGGAGE MANIFEST\n";
// for (LuggageSlip slip : slips) {
// output += slip.toString() + "\n";
// }
// return output;
// }
// }
