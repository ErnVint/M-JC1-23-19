package dto.Vehicle.Tyres;

public class WTyres extends ATyres implements ITyres {
    public WTyres(int size, String brand) {
        super(size, brand);
    }
    public String getSeason(){return "Winter Tyres";}
}
