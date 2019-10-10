package dto.Vehicle;

public class PassSeats extends AParts implements IPassSeats {

    @Override
    public String getPartName() {
        return "Passenger Seats Count";
    }

    private int passseatscount;

    public int PassSeats(int passseatscount) {
        return this.passseatscount = passseatscount;
    }

    @Override
    public int getPassSeats() {
        return 0;
    }
}
