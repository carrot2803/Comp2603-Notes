
public class Runner {
    public static void main(String[] args) {
        Periflaks[] samples = new Periflaks[4];
        samples[0] = new Periflaks(81);
        samples[1] = new Periflaks(56);
        samples[2] = new Periflaks(-70);
        samples[3] = new Periflaks(42);
        for (Periflaks sample : samples)
            sample.squite();
    }
}
