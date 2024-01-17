public class Vehicle {
    private static int plateCounter = 1;
    private int tankCapacity;
    private String plateID;
    private String fuelType;
    private int vehicleClassification;

    public Vehicle(int length, int width, int breadth, int classification) {
        this.tankCapacity = length * width * breadth;
        this.fuelType = (tankCapacity % 2 == 0) ? "gasoline" : "diesel";
        setPlateID();
        setVehicleClassification(classification);
    }

    private void setPlateID() {
        this.plateID = "TAB" + Integer.toString(plateCounter);
        plateCounter = plateCounter + 1;
    }

    private boolean isValidClassification(int n) {
        return n == 1 || n == 3 || n == 4;
    }

    private void setVehicleClassification(int n) {
        if (!isValidClassification(n))
            this.vehicleClassification = 3;
        this.vehicleClassification = n;
    }

    public String getPlateID() {
        return this.plateID;
    }

    public int getTankCapacity() {
        return this.tankCapacity;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public int getVehicleClassification() {
        return this.vehicleClassification;
    }

    public String getVehicleClassification(int classification) {
        if (classification == 1)
            return "MOTORCYCLE";
        else if (classification == 4)
            return "Heavy motor vehicle";
        return "Light motor vehicle";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vehicle))
            return false;
        Vehicle v = (Vehicle) obj;
        String plateId = v.getPlateID();
        return this.plateID.equals(plateId);
    }

    public String toString() {
        return "VEHICLE TANK CAPACITY: " + getTankCapacity()
                + " FUEL TYPE: " + getFuelType()
                + " PLATE ID: " + getPlateID()
                + " VEHICLE CLASSIFICATION: " + getVehicleClassification()
                + " " + getVehicleClassification(this.vehicleClassification);
    }

}
