package dto.Vehicle;


public class GasEngine extends AParts implements IEngine {

    public String id;
    private int volume;
    private String fuel;


    public GasEngine (String id, int volume){
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
        return "Gas";
    }



}
