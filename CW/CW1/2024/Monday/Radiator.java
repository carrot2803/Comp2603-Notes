public class Radiator {
    private static int counter = 1000;
    private int radiatorID;
    private Room room;

    public Radiator() {
        this.radiatorID = counter;
        counter += 10;
        this.room = null;
    }

    public int getRadiatorID() {
        return this.radiatorID;
    }

    public Room getRoom() {
        return this.room;
    }

    public void heats(Room rm) {
        this.room = rm;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Radiator))
            return false;
        Radiator temp = (Radiator) obj;
        return this.radiatorID == temp.radiatorID;
    }

    public String toString() {
        if (room == null)
            return getRadiatorID() + " Room: unassigned";
        return getRadiatorID() + " Room: " + getRoom().getRoomName();
    }

}
