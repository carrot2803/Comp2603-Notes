public class Door extends MazeElement {
    private boolean isOpen;

    public Door(String colour, boolean isOpen) {
        super(colour);
        this.isOpen = isOpen;
    }

    // Door follows basic rules of inheritance there is no need for a constructor
    // as the super class has its own no argument constructor
    public boolean enter() {
        return isOpen;
    }

    public boolean isDoorOpen() {
        return isOpen;
    }
}
