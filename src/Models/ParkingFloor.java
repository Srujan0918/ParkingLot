package Models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int Floornum;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus parkingFloorStatus;

    public int getFloornum() {
        return Floornum;
    }

    public void setFloornum(int floornum) {
        Floornum = floornum;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
