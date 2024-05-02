public class Room extends MazeElement {
    private static int counter = 1;
    private int roomID;

    public Room() {
        super();
        this.roomID = counter++;
    }

    public void addAdjacentMazeElement(MazeElement me, String location) {

    }

}
