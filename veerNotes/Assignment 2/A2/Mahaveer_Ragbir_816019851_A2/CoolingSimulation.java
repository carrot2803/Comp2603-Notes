import java.util.ArrayList;


public class CoolingSimulation {
    
    private ArrayList<Room> rooms;
    
    Room room1;
    Room room2;
    Room room3;
    Room room4;
        
    public CoolingSimulation() {
       rooms = new ArrayList<Room>();
    }
    
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    // Returns a Room object stored in the rooms ArrayList at the particular index if the index is between 1-4 inclusive.
    public Room getRoom(int i) {
        if (i >= 1 && i <= 4) {
            return rooms.get(i-1);
        } else {
            return null;
        }
    }
    
    public void createRooms() {
        rooms.add(new Room(30));
        rooms.add(new Room(35));
        rooms.add(new Room(37));
        rooms.add(new Room(25));
    }
 
    public void createDevices() {
        room1 = getRoom(1);
        room2 = getRoom(2);
        room3 = getRoom(3);
        room4 = getRoom(4);
        
        // Room 1
        room1.addDevice(new AC());
        room1.addDevice(new CeilingFan());
        for (int i = 1; i <= 3; i++){
            room1.addDevice(new StandingFan());
        }
        
        // Room 2
        for (int i = 1; i <= 2; i++){
            room2.addDevice(new AC());
        }
        room2.addDevice(new CeilingFan());
        for (int i = 1; i <= 4; i++){
            room2.addDevice(new StandingFan());
        }
        
        // Room 3
        room3.addDevice(new AC());
        for (int i = 1; i <= 2; i++){
            room3.addDevice(new CeilingFan());
        }
        for (int i = 1; i <= 2; i++){
            room3.addDevice(new StandingFan());
        }
        
        // Room 4
        room4.addDevice(new AC());
        room4.addDevice(new CeilingFan());
        room4.addDevice(new StandingFan());
        
        
    }

    // // Creates the Device objects in Table 2 and associate them with the appropriate room objects stored in the rooms ArrayList
    // public void createDevices() {
        // // Create air conditioner devices
        // Device ac1 = new AC();
        // Device ac2 = new AC();
        // Device ac3 = new AC();
        // Device ac4 = new AC();
        // Device ac5 = new AC();
        
        // // Create ceiling fan devices
        // Device cf1 = new CeilingFan();
        // Device cf2 = new CeilingFan();
        // Device cf3 = new CeilingFan();
        // Device cf4 = new CeilingFan();
        // Device cf5 = new CeilingFan();
        
        // // Create standing fan devices
        // Device sf1 = new StandingFan();
        // Device sf2 = new StandingFan();
        // Device sf3 = new StandingFan();
        // Device sf4 = new StandingFan();
        // Device sf5 = new StandingFan();
        // Device sf6 = new StandingFan();
        // Device sf7 = new StandingFan();
        // Device sf8 = new StandingFan();
        // Device sf9 = new StandingFan();
        // Device sf10 = new StandingFan();
        
        // // Associate devices with rooms
        
        // // Room 1
        // rooms.get(0).addDevice(ac1);
        // rooms.get(0).addDevice(cf1);
        // rooms.get(0).addDevice(sf1);
        // rooms.get(0).addDevice(sf2);
        // rooms.get(0).addDevice(sf3);
        
        // // Room 2
        // rooms.get(1).addDevice(ac2);
        // rooms.get(1).addDevice(ac3);
        // rooms.get(1).addDevice(cf2);
        // rooms.get(1).addDevice(sf4);
        // rooms.get(1).addDevice(sf5);
        // rooms.get(1).addDevice(sf6);
        // rooms.get(1).addDevice(sf7);
        
        // // Room 3
        // rooms.get(2).addDevice(ac4);
        // rooms.get(1).addDevice(cf3);
        // rooms.get(1).addDevice(cf4);
        // rooms.get(2).addDevice(sf8);
        // rooms.get(1).addDevice(sf9);
        
        // // Room 4
        // rooms.get(1).addDevice(ac5);
        // rooms.get(3).addDevice(cf5);
        // rooms.get(3).addDevice(sf10);
        
        // // Tried making arrays and using for loops to create and add each device but got lost in the sauce...

    // }
    
    // Turns on Devices in Room 1
    public void coolRoom1() {
        for (Device d : room1.getDevices()) {
            if (d.isNoisy() || d.isBreezy()){
                d.turnOn();
            }
            else{
                d.turnOff();
            }
        }
        
        room1.getTemperature();
        room1.getBreeziness();
        room1.getNoisiness();

    }
    
    // Turns on Devices in Room 2
    public void coolRoom2() {
        for (Device d : room2.getDevices()) {
            if (!d.isNoisy() && !d.isNoisy()){
                d.turnOn();
            }
            else{
                d.turnOff();
            }
        }
        
        room2.getTemperature();
        room2.getBreeziness();
        room2.getNoisiness();
    }
    
    // Turns on Devices in Room 3
    public void coolRoom3(){
         for (Device d : room3.getDevices() ){
            if (d.isNoisy()){
                d.turnOff();
            }
            else{
                d.turnOn();
            }
        }
        
        room3.getTemperature();
        room3.getBreeziness();
        room3.getNoisiness();
    }
    
    // Removes PortableDevices that are turned off in Room r1, and add them to Room r2
    public void swapPortableDevices(Room Room1, Room Room2) {
        ArrayList<PortableDevice> move = new ArrayList<>();
        
        for (Device dev : room1.getDevices()) {
            if (dev instanceof PortableDevice && !dev.isOn()) {
                move.add((PortableDevice) dev);
            }
        }
        
        for (PortableDevice dev : move) {
            room1.removeDevice(dev);
            room2.addDevice(dev);
        }
        
    } 
    
    // Turns on Devices in Room 4
    public void coolRoom4(){
        
        swapPortableDevices(room1,room4);
        swapPortableDevices(room2,room4);
        swapPortableDevices(room3,room4);
        
        for (Device d : room4.getDevices() ){
            d.turnOn();
        }
                  
        room4.getTemperature();
        room4.getBreeziness();
        room4.getNoisiness();
    }
    
    public void printStates(){
        for (Room room : rooms) {
           room.printState();
        }
    }
    
    public static void main(String[] args){
         CoolingSimulation sim = new CoolingSimulation();
         sim.createRooms();
         sim.createDevices();
         sim.coolRoom1();
         sim.coolRoom2();
         sim.coolRoom3();
         sim.coolRoom4();
         sim.printStates();
     }


}

        
    

    
