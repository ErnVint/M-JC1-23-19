package java.dto.Vehicle.Tyres;

import java.dto.Vehicle.IParts;

public interface ITyres extends IParts {
    default String getPartName() {return "Tyres";}
    int getTyreSize();
    String getBrand();
    String getSeason();

}
