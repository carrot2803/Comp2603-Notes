public abstract class MazeElement {
    private String colour;

    public MazeElement() {
        this.colour = "";
    }

    // e(i) Yes they would successfully compile as the super class provides a no
    // argument constructor
    public MazeElement(String colour) {
        this.setColour(colour);
    }

    // f Yes they would compile even if the MazeElement does no have a no argument
    // constructor as it is not needed by these classes which use a colour
    // constructor
    // Room may not compile based on how it is implemented

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean enter() {
        return false;
    }
}