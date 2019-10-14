package java.dto.Vehicle.Engine;


import java.dto.Vehicle.AParts;

public class DieselEngine extends AParts implements IEngine {

    public String id;
    private int volume;
    private String fuel;


    public DieselEngine (String id, int volume){
        this.id = id;
        this.volume = volume;

    }

    public String getId() {
        return id;
    }

    public int getVolume() {
        return volume;
    }


    public String getFuel() {
        return "Diesel";
    }



}
