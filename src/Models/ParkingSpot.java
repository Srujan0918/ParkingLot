package Models;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private int spotnum;
    private ParkingFloor parkingFloor;
    private ParkingSpotStatus parkingSpotStatus;
    private List<VehichleType> supportedvehichleTypes;

    public int getSpotnum() {
        return spotnum;
    }

    public void setSpotnum(int spotnum) {
        this.spotnum = spotnum;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public List<VehichleType> getSupportedvehichleTypes() {
        return supportedvehichleTypes;
    }

    public void setSupportedvehichleTypes(List<VehichleType> supportedvehichleTypes) {
        this.supportedvehichleTypes = supportedvehichleTypes;
    }
}
