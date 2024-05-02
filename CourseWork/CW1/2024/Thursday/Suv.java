
public class Suv extends Car {
    private final static int maxScreens = 3;

    public Suv(String licenseNo) {
        super(licenseNo);
    }

    public String attachScreen(Screen s) {
        if (super.getScreens().size() >= maxScreens)
            return "Cannot add screen. Suv has maximum number of screens.";
        return super.attachScreen(s);
    }

}