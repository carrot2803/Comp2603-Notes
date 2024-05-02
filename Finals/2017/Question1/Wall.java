public class Wall extends MazeElement {
    public Wall(String colour) {
        super(colour);
    }

    // b the private attribute in the superclass can be set via
    // a super constructor or a super mutator.

    public boolean enter() {
        return false;
    }
}
