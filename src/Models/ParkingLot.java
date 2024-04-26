package Models;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VehichleType> vehichleTypes;
    private ParkingLotStatus parkingLotStatus;
    private List<Ticket> tickets;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehichleType> getVehichleTypes() {
        return vehichleTypes;
    }

    public void setVehichleTypes(List<VehichleType> vehichleTypes) {
        this.vehichleTypes = vehichleTypes;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
