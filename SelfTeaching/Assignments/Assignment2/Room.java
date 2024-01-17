import java.util.ArrayList;

public class Room {
    private int temperature;
    private ArrayList<Device> devices;

    public Room(int temperature) {
        this.temperature = temperature;
        this.devices = new ArrayList<Device>();
    }

    public ArrayList<Device> getDevices() {
        return this.devices;
    }

    public boolean addDevice(Device d) {
        if (this.devices.contains(d))
            return false;
        this.devices.add(d);
        return true;
    }

    public boolean removeDevice(Device d) {
        if (!(d instanceof PortableDevice))
            return false;
        return this.devices.remove(d);
    }

    public int getTemperatureDrop() {
        int temperatureDrop = 0;
        for (Device d : this.devices)
            if (d.isOn())
                temperatureDrop += d.coolsBy();
        return temperatureDrop;
    }

    public int getTemperature() {
        return this.temperature - this.getTemperatureDrop();
    }

    public int getBreeziness() {
        int breeziness = 0;
        for (Device d : this.devices)
            if (d.isOn() && d.isBreezy())
                breeziness += d.getBreeziness();
        return breeziness;
    }

    public int getNoisiness() {
        int noisiness = 0;
        for (Device d : this.devices)
            if (d.isOn() && d.isNoisy())
                noisiness += d.getNoisiness();
        return noisiness;
    }

    public void printState() {
        System.out.println("Room temperature: " + this.getTemperature() + "C");
        System.out.println("Room breeziness: " + this.getBreeziness());
        System.out.println("Room noisiness: " + this.getNoisiness());
        System.out.println("Devices:");
        for (Device d : this.devices) {
            String status = "off:";
            if (d.isOn())
                status = "on";
            System.out.println(" - " + d.getID() + " is " + status);
        }
        System.out.println();
    }

}
