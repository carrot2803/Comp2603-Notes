import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList<Periflaks> units = new LinkedList<Periflaks>();
        units.add(new Periflaks(0));

        units.remove(); // line 1
        units.remove(new Periflaks(56)); // line 2
        units.remove(1); // line 3
    }
}
