// public class Vehicle {
// private int tankCapacity;
// private String fuelType;
// private static int plateNumber = 1;
// private int vehicleClassification;
// private String plateID;

// public Vehicle(int length, int breadth, int width) {
// tankCapacity = length * breadth * width;
// fuelType = (tankCapacity % 2 == 0) ? "gasoline" : "diesel";
// setPlateID();
// }

// public Vehicle(int length, int breadth, int width, int vehicleClassification)
// {
// this(length, breadth, width);
// setVehicleClassification(vehicleClassification);
// }

// // accessor
// public int getTankCapacity() {
// return tankCapacity;
// }

// public String getFuelType() {
// return fuelType;
// }

// public String getPlateID() {
// return plateID;
// }

// public int getVehicleClassification() {
// return vehicleClassification;
// }

// public String getVehicleClassification(int classification) {
// switch (classification) {
// case 1:
// return "Motorcycle";
// case 4:
// return "Heavy motor vehicle";
// case 3:
// return "Light motor vehicle";
// }
// return null;
// }

// // mutator
// private void setPlateID() {
// this.plateID = "TAB" + plateNumber++;
// }

// public void setVehicleClassification(int value) {
// if (value == 1 || value == 4)
// this.vehicleClassification = value;
// else
// this.vehicleClassification = 3;
// }

// public String toString() {
// return "VEHICLE TANK CAPACITY: " + getTankCapacity()
// + " FUEL TYPE: " + getFuelType()
// + " PLATE ID: " + getPlateID()
// + " VEHICLE CLASSIFICATION: " + getVehicleClassification()
// + " " + getVehicleClassification(this.vehicleClassification);
// }

// public boolean equals(Object obj) {
// if (!(obj instanceof Vehicle))
// return false;
// Vehicle v = (Vehicle) obj;
// return this.plateID.equals(v.plateID);
// }

// }