package dto.Vehicle.Tyres;

public class ASTyres extends ATyres implements ITyres {

    public ASTyres(int size, String brand) {
        super(size, brand);
    }
    public String getSeason(){return "All-Season Tyres";}
}
