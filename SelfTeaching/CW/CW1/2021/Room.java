// public class Room {
// private String roomName;
// private int seatingCapacity;
// private int numRadiators;
// private Radiator[] radiators = new Radiator[2];

// public Room(String roomName) {
// this.roomName = roomName;
// this.seatingCapacity = 15;
// this.numRadiators = 0;
// }

// public String isHeatedBy(Radiator rd) {
// if (numRadiators == 2) {
// return "Cannot add Radiator. Room has maximum number of radiators.";
// }

// for (Radiator r : radiators) {
// if (r == rd) {
// return "Radiator already added to room.";
// }
// }

// radiators[numRadiators] = rd;
// numRadiators++;

// return "Radiator successfully added to room.";
// }
// }
