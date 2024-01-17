import java.io.*;
import java.util.*;

public class CeilingFan extends Fan {
    private String ID;
    private static int cfanID = 1;
    private boolean on;
    
    public CeilingFan() {
        super(0);
        this.ID = "CFAN" + cfanID;
        cfanID++;
        this.on = false;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public boolean isPortable (){
        return false;
    }
    
    public int getBreeziness(){
        return 2;
    }
    
    public int getNoisiness() {
        return 0;
    }
    
    public int coolsBy() {
        return 3;
    }
    
    public void turnOn() {
        this.on = true;
        //System.out.println("AC " + id + " turned on");
    }
    
    public void turnOff() {
        this.on = false;
        //System.out.println("AC " + id + " turned off");
    }
    
    public boolean isOn() {
        return on;
    }
    
    public boolean isBreezy() {
        return true;
    }
    
    public boolean isNoisy(){
        return false;
    }
    // public CeilingFan(int noisiness) {
        // super(noisiness);
        // this.id = "CFAN" + super.getId();
    // }

    // public void turnOn() {
        // System.out.println("Ceiling fan " + id + " is turned on.");
    // }

    // public void turnOff() {
        // System.out.println("Ceiling fan " + id + " is turned off.");
    // }

    // public void adjustSettings() {
        // System.out.println("Ceiling fan " + id + " settings adjusted.");
    // }
    
    // @Override
    // public String getId() {
        // return this.id;
    // }

    // public int getNoisiness() {
        // return super.getNoisiness();
    // }
    
    // public int coolsBy() {
        // // Implement the behavior for calculating the temperature
        // // drop produced by a ceiling fan and return it as an integer
    // }
    
    // public int getBreeziness() {
        // // Implement the behavior for getting the breeziness
        // // of a ceiling fan and return it as an integer
    // }
}
