public class FuelStation {
    private String fuelType;
    private double fuelVolume;
    private double fuelRate;
    private double fuelSales;

    public FuelStation() {
        this.fuelType = "gasoline";
        this.fuelVolume = 75000.00;
        this.fuelRate = 2.0;
        this.fuelSales = 0.0;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuelSales() {
        return fuelSales;
    }

    public String toString() {
        return "FUEL: " + fuelType + " VOL: " + fuelVolume + "L PRICE PER L: $" +
                String.format("%.2f", fuelRate) + " SALES: $" + String.format("%.2f", fuelSales);
    }

    private boolean sellFuel(double volume) {
        if (this.fuelVolume - volume <= 0)
            return false;
        this.fuelVolume -= volume;
        this.fuelSales += (volume * fuelRate);
        return true;
    }

    public boolean canDispenseFuelType(String fuelType) {
        return this.fuelType.equalsIgnoreCase(fuelType);
    }

    public boolean dispense(String fuelType, double volume) {
        if (!canDispenseFuelType(fuelType))
            return false;
        return sellFuel(volume);
    }
}