public class Screen {
    private static int counter = 10;
    private int screenID;
    private Car car;

    public Screen() {
        this.screenID = counter;
        counter += 10;
        this.car = null;
    }

    public int getScreenID() {
        return this.screenID;
    }

    public Car getCar() {
        return this.car;
    }

    public void connectToCar(Car c) {
        this.car = c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Screen))
            return false;
        Screen screen = (Screen) obj;
        return this.screenID == screen.screenID;
    }

    public String toString() {
        return this.getScreenID() + " Car: " + this.car;
    }

}