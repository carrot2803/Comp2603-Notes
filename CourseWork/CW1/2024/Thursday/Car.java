import java.util.ArrayList;

public class Car {
    private String licenseNo;
    private ArrayList<Screen> screens;

    public Car(String licenseNo) {
        this.licenseNo = licenseNo;
        this.screens = new ArrayList<Screen>();
    }

    public String getLicenseNo() {
        return this.licenseNo;
    }

    public ArrayList<Screen> getScreens() {
        return this.screens;
    }

    public String attachScreen(Screen s) {
        if (screens.size() >= 3) {
            return "Cannot add screen. Car has maximum number of screens.";
        } else if (screens.contains(s) || s.getCar() != null) {
            return "Screen " + s.getScreenID() + " already added to car " + s.getCar().getLicenseNo();
        }
        boolean added = screens.add(s);
        if (!added)
            return "Screen could not be added, error.";
        s.connectToCar(this);
        return "Screen " + s.getScreenID() + " added to car " + this.getLicenseNo();
    }

    public String toString() {
        return "Car: " + this.getLicenseNo() + " Num Screens: " + this.getScreens().size();
    }

}
