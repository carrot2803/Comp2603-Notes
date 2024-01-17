import java.util.ArrayList;

public class Room {
    private int temperature;
    private ArrayList<Device> devices;
    
    // public ArrayList<PortableDevice> getPortableDevices() {
        // ArrayList<PortableDevice> portableDevices = new ArrayList<>();
        // for (Device device : this.devices) {
            // if (device instanceof PortableDevice) {
                // portableDevices.add((PortableDevice) device);
            // }
        // }
        // return portableDevices;
    // } 
    
    public Room(int startingTemperature) {
        this.temperature = startingTemperature;
        this.devices = new ArrayList<Device>();
    }
    
    // Returns an ArrayList of devices
    public ArrayList<Device> getDevices() {
        return this.devices;
    }
    
    // Return true if a device was successfully inserted into the devices ArrayList, false if the device already exists in the collection.
    public boolean addDevice(Device d) {
        if (this.devices.contains(d)) {
            return false;
        } else {
            this.devices.add(d);
            return true;
        }
    }
    
    // Removes a device from the devices ArrayList if it is a PortableDevice and returns true, false otherwise
    public boolean removeDevice(Device d) {
        if (d instanceof PortableDevice) {
            return this.devices.remove(d);
        } else {
            return false;
        }
    }
    
    // Returns the temperature drop produced by all of the devices turned on in the room
    public int getTemperatureDrop() {
        int temperatureDrop = 0;
        for (Device d : this.devices) {
            if (d.isOn()) {
                temperatureDrop += d.coolsBy();
            }
        }
        return temperatureDrop;
    }

    // Returns the temperature of the room (based on the devices turned on in the room)
    public int getTemperature() {
        int temperature = this.temperature - this.getTemperatureDrop();
        return temperature;
    }

    // Returns the breeziness of the room (produced by the devices turned on in the room)
    public int getBreeziness() {
        int breeziness = 0;
        for (Device d : this.devices) {
            if (d.isOn() && d.isBreezy()) {
                breeziness += d.getBreeziness();
            }
        }
        return breeziness;
    }
    
    // Returns the noisiness of the room (produced by the devices turned on in the room)
    public int getNoisiness() {
        int noisiness = 0;
        for (Device d : this.devices) {
            if (d.isOn() && d.isNoisy()) {
                noisiness += d.getNoisiness();
            }
        }
        return noisiness;
    }
    
    // Prints the state of the room and the devices
    public void printState() {
        System.out.println("Room temperature: " + this.getTemperature() + "C");
        System.out.println("Room breeziness: " + this.getBreeziness());
        System.out.println("Room noisiness: " + this.getNoisiness());
        System.out.println("Devices:");
        for (Device d : this.devices) {
            String status = "off:";
            if (d.isOn()){
                status = "on";
            }
            System.out.println(" - " + d.getID() + " is " + status);
        }
        System.out.println();
    }
    
}
