package dto.Vehicle.Tyres;

import dto.Vehicle.IParts;

public interface ITyres extends IParts {
    default String getPartName() {return "Tyres";}
    int getTyreSize();
    String getBrand();
    String getSeason();

}
