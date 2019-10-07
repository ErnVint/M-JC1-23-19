package dto.Vehicle.Engine;

import dto.Vehicle.IParts;

public interface IEngine extends IParts {
    int getVolume();
    String getFuel();
    String getId();
    default String getPartName() {return "Engine";};
}
