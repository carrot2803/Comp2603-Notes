import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    private static int getRandomNumber(int i, int j) {
        return (int) ((Math.random() * (j - i + 1)) + i);
    }

    private static void initPassengers(TreeMap<String, Passenger> map) {
        Passenger[] passengers = { new Passenger("Joe"), new Passenger("Sid"), new Passenger("Lou"),
                new Passenger("Gil"), new Passenger("Moe") };
        for (Passenger passenger : passengers)
            map.put(passenger.getName(), passenger);
    }

    private static void initVehicles(TreeMap<Vehicle, Passenger> vehiclesMap,
            TreeMap<String, Passenger> passengersMap) {
        Vehicle[] vehicles = {
                new Vehicle("RLM01", getRandomNumber(1, 100), getRandomNumber(1, 100), getRandomNumber(1, 100)),
                new Vehicle("MYA04", getRandomNumber(1, 100), getRandomNumber(1, 100), getRandomNumber(1, 100)),
                new Vehicle("CTJ02", getRandomNumber(1, 100), getRandomNumber(1, 100), getRandomNumber(1, 100)) };
        int i = 0;
        for (Passenger p : passengersMap.values()) {
            if (i >= vehicles.length)
                break;
            vehiclesMap.put(vehicles[i++], p);
        }
    }

    public static void main(String[] args) {
        Passenger[] passengers = { new Passenger("Joe"), new Passenger("Sid"), new Passenger("Lou"),
                new Passenger("Gil"), new Passenger("Moe") };
        TreeMap<String, Passenger> passengersMap = new TreeMap<>();
        initPassengers(passengersMap);

        Passenger sid = passengersMap.get("Sid");
        sid.setName("Syd");
        passengersMap.remove("Sid");
        passengersMap.put(sid.getName(), sid);

        Ticket sydsTicket = sid.getTicket();
        System.out.println(sydsTicket);

        TreeMap<Vehicle, Passenger> vehiclesMap = new TreeMap<>();
        initVehicles(vehiclesMap, passengersMap);

        System.out.println(vehiclesMap);

        Vehicle v6 = new Vehicle("CTJ02", getRandomNumber(1, 5), getRandomNumber(1, 5), getRandomNumber(1, 5));
        vehiclesMap.put(v6, new Passenger("Syd"));
        System.out.println("Part 2(e)\n" + vehiclesMap);

        HashMap<Ticket, Passenger> ticketsMap = new HashMap<>();
        // (b) Add the five passengers from 1(a) to the HashMap and printout the
        // ticketList contents.
        for (Passenger p : passengers) {
            Ticket t = p.getTicket();
            ticketsMap.put(t, p);
        }
        System.out.println(ticketsMap);

        Ticket tx = new Ticket();
        tx.setTicketNumber(100);
        ticketsMap.put(tx, passengers[0]);
        System.out.println("Part 3(c)(i)\n" + ticketsMap);

        Ticket ty = new Ticket();
        ty.setTicketNumber(100);
        ticketsMap.remove(ty);
        System.out.println("Part 3(c)(ii)\n" + ticketsMap);

        Ticket tz = new Ticket();
        tz.setTicketNumber(100);
        System.out.println("Part 3(c)(iii)\n" + ticketsMap.containsKey(tx));
        System.out.println("Part 3(c)(iii)\n" + ticketsMap.containsKey(ty));
        System.out.println("Part 3(c)(iii)\n" + ticketsMap.containsKey(tz));
    }
}
