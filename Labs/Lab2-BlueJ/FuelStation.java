public class FuelStation {
    private String fuelType;
    private double fuelVolume;
    private double fuelRate;
    private double fuelSales;

    public FuelStation() {
        this.fuelType = "gasoline";
        this.fuelVolume = 75000;
        this.fuelRate = 2;
        this.fuelSales = 0;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public double getFuelVolume() {
        return this.fuelVolume;
    }

    public double getFuelRate() {
        return this.fuelRate;
    }

    public double getFuelSales() {
        return this.fuelSales;
    }

    public boolean sellFuel(double volume) {
        if (this.fuelVolume < volume)
            return false;
        this.fuelVolume -= volume;
        this.fuelSales += (volume * fuelRate);
        return true;
    }

    public boolean canDispenseFuelType(String fuelType) {
        return this.fuelType.equalsIgnoreCase(fuelType);
    }

    public boolean dispense(String fuelType, double volume) {
        if (!canDispenseFuelType(fuelType) || this.fuelVolume < volume)
            return false;
        return sellFuel(volume);
    }

    public boolean sellFuel() {
        return false;
    }

    public String toString() {
        return "FUEL: " + fuelType + " VOL: " + fuelVolume + "L PRICE PER L: $" +
                String.format("%.2f", fuelRate) + " SALES: $" + String.format("%.2f", fuelSales);
    }

}