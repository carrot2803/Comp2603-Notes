public class Runner {
    public static void main(String[] args) {
        MazeElement m = new Door("Green", true);
        Door d = (Door) m;
        d.enter();
    }
}
// i compiles and runs basic inheritance here
// ii. wont compile nor run as MazeElement is an abstract class
// and line 3 will not be found in the inheritance chain.

// iii. Will not compile nor run cannot instantiate an abstract class.
// iv. Will compile and run, inheritance chain is correct and object is casted
// to Door
// so this avoids the reverse polymorphism problem
// v. Compiles and runs standard static polymorphism