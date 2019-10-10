package dto.Vehicle.Tyres;

public class STyres extends ATyres implements ITyres {

    public STyres(int size, String brand) {
        super(size, brand);
    }
    public String getSeason(){return "Summer Tyres";}
}
