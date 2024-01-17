// import java.util.concurrent.atomic.AtomicInteger;

// public class Radiator {
// private final int radiatorID;
// private boolean isTurnedOn;

// private static final AtomicInteger nextRadiatorID = new AtomicInteger(1000);

// public Radiator() {
// this.radiatorID = nextRadiatorID.getAndAdd(10);
// this.isTurnedOn = false;
// }

// public int getRadiatorID() {
// return radiatorID;
// }

// public void heats(Room rm) {
// rm.isHeatedBy(this);
// }
// }
