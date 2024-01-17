import java.util.ArrayList;

public class CoolingSimulation {

    private ArrayList<Room> rooms;

    public CoolingSimulation() {
        rooms = new ArrayList<>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Room getRoom(int i) {
        return (i >= 1 && i <= 4) ? rooms.get(i - 1) : null;
    }

    public void createRooms() {
        rooms.add(new Room(30));
        rooms.add(new Room(35));
        rooms.add(new Room(37));
        rooms.add(new Room(25));
    }

    public void createDevices() {
        for (int i = 0; i < 4; i++) {
            Room room = getRoom(i + 1);
            if (room == null)
                continue;
            room.addDevice(new AC());
            room.addDevice(new CeilingFan());
            for (int j = 0; j < i + 3; j++)
                room.addDevice(new StandingFan());
        }
    }

    public void coolRoom(Room room) {
        for (Device device : room.getDevices())
            if ((device.isNoisy() || device.isBreezy()) && !device.isOn())
                device.turnOn();
            else if (!(device.isNoisy() || device.isBreezy()) && device.isOn())
                device.turnOff();
        room.getTemperature();
        room.getBreeziness();
        room.getNoisiness();
    }

    public void swapPortableDevices(Room fromRoom, Room toRoom) {
        ArrayList<Device> move = new ArrayList<>();
        for (Device dev : fromRoom.getDevices())
            if (dev instanceof PortableDevice && !dev.isOn())
                move.add(dev);
        for (Device dev : move) {
            fromRoom.removeDevice(dev);
            toRoom.addDevice(dev);
        }
    }

    public void coolAllRooms() {
        for (Room room : rooms)
            coolRoom(room);
    }

    public void printStates() {
        for (Room room : rooms)
            room.printState();
    }

    public static void main(String[] args) {
        CoolingSimulation sim = new CoolingSimulation();
        sim.createRooms();
        sim.createDevices();
        sim.coolAllRooms();
        sim.printStates();
    }
}
