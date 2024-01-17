public interface Device {
    public String getID();

    public boolean isBreezy();

    public boolean isNoisy();

    public boolean isOn();

    public void turnOn();

    public void turnOff();

    public int coolsBy();

    public int getBreeziness();

    public int getNoisiness();
}