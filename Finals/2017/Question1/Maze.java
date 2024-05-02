import java.util.ArrayList;
import java.util.Collection;

public class Maze {
    private Collection<Room> rooms;

    public Maze() {
        rooms = new ArrayList<Room>();
    }

    public boolean addRoom(Room r) {
        if (rooms.size() >= 16)
            return false;
        return this.rooms.add(r);
    }
}
