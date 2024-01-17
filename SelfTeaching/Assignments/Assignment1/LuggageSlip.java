public class LuggageSlip {
    private static int luggageSlipIDCounter = 1;
    private Passenger owner;
    private String luggageSlipID;
    private String label;

    // constructors
    public LuggageSlip(Passenger p, Flight f) {
        this.owner = p;
        this.luggageSlipID = f.getFlightNo() + "_" + p.getLastName() + "_" + luggageSlipIDCounter++;
        this.label = "";
    }

    public LuggageSlip(Passenger p, Flight f, String label) {
        this.owner = p;
        this.luggageSlipID = f.getFlightNo() + "_" + p.getLastName() + "_" + luggageSlipIDCounter++;
        this.label = label;
    }

    // methods
    public boolean hasOwner(String passportNumber) {
        return owner.getPassportNumber().equals(passportNumber);
    }

    // accessors
    public Passenger getOwner() {
        return owner;
    }

    public int getLuggageSlipIDCounter() {
        return luggageSlipIDCounter;
    }

    public String getLuggageSlipID() {
        return luggageSlipID;
    }

    public String getLabel() {
        return label;
    }

    public String toString() {
        return getLuggageSlipID() + " " + getOwner().toString() + " " + getLabel() + "\n";
    }

}
