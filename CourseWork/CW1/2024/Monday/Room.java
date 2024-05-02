import java.util.ArrayList;

public class Room {
    private ArrayList<Radiator> radiators;
    private String roomName;

    public Room() {
        this.radiators = new ArrayList<Radiator>();
    }

    public Room(String roomName) {
        this();
        this.roomName = roomName;
    }

    public ArrayList<Radiator> getRadiators() {
        return this.radiators;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public String isHeatedBy(Radiator rd) {
        if (radiators.size() >= 2)
            return "Cannot add Radiator. Room has maximum number of radiators";
        else if (radiators.contains(rd) || rd.getRoom() != null)
            return "Radiator " + rd.getRadiatorID() + " already added to room " + rd.getRoom().getRoomName();
        boolean added = radiators.add(rd);
        if (!added)
            return "Radiator could not be added, error";
        rd.heats(this);
        return "Radiator " + rd.getRadiatorID() + " added to room " + getRoomName();
    }

    public String toString() {
        return "Room: " + getRoomName() + " Num Radiators: " + getRadiators().size();
    }

}
