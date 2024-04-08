import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Joe");
        Passenger p2 = new Passenger("Sid");
        Passenger p3 = new Passenger("Lou");
        Passenger p4 = new Passenger("Gil");
        Passenger p5 = new Passenger("Moe");

        TreeMap<String, Passenger> passengers = new TreeMap<>();
        passengers.put(p1.getName(), p1);
        passengers.put(p2.getName(), p2);
        passengers.put(p3.getName(), p3);
        passengers.put(p4.getName(), p4);
        passengers.put(p5.getName(), p5);

        // System.out.println(passengers);
        // Ticket ticket = passengers.get("Gil").getTicket();
        // System.out.println(ticket.toString());

        // Passenger syd = passengers.get("Sid");
        // passengers.remove("Sid");
        // syd.setName("Syd");
        // passengers.put(syd.getName(), syd);

        // Ticket sydsTicket = syd.getTicket();
        // System.out.println(sydsTicket);

        Vehicle v1 = new Vehicle("RLM01",
                getRandomNumber(1, 5),
                getRandomNumber(1, 5),
                getRandomNumber(1, 5));
        Vehicle v2 = new Vehicle("CTJ02",
                getRandomNumber(1, 5),
                getRandomNumber(1, 5),
                getRandomNumber(1, 5));
        Vehicle v3 = new Vehicle("DSC03",
                getRandomNumber(1, 5),
                getRandomNumber(1, 5),
                getRandomNumber(1, 5));
        Vehicle v4 = new Vehicle("MYA04",
                getRandomNumber(1, 5),
                getRandomNumber(1, 5),
                getRandomNumber(1, 5));
        Vehicle v5 = new Vehicle("BTN05",
                getRandomNumber(1, 5),
                getRandomNumber(1, 5),
                getRandomNumber(1, 5));

        // System.out.println(v1);
        // System.out.println(v2);
        // System.out.println(v3);
        // System.out.println(v4);
        // System.out.println(v5);

        TreeMap<Vehicle, Passenger> vehicles = new TreeMap<>();
        vehicles.put(v1, p1);
        vehicles.put(v2, p2);
        vehicles.put(v3, p3);
        vehicles.put(v4, p4);
        vehicles.put(v5, p5);

        // System.out.println(vehicles);

        Vehicle v6 = new Vehicle("CTJ02", getRandomNumber(1, 5), getRandomNumber(1, 5), getRandomNumber(1, 5));
        vehicles.put(v6, p2);
        // System.out.println("Part 2(e)\n" + vehicles);

        HashMap<Ticket, Passenger> ticketList = new HashMap<>();

        for (Passenger passenger : passengers.values()) {
            Ticket ticket = passenger.getTicket();
            ticketList.put(ticket, passenger);
        }

        // for (String key : passengers.keySet()) {
        // Passenger passenger = passengers.get(key);
        // Ticket ticket = passenger.getTicket();
        // ticketList.put(ticket, passenger);
        // }

        Ticket tx = new Ticket();
        tx.setTicketNumber(100);
        ticketList.put(tx, p3);
        System.out.println("Part 3(c)(i)\n" + ticketList);

        Ticket ty = new Ticket();
        ty.setTicketNumber(100);
        ticketList.remove(ty);
        System.out.println("Part 3(c)(ii)\n" + ticketList);

    }

    private static int getRandomNumber(int i, int j) {
        return (int) (Math.random() * (j - i + 1) + i);
    }
}