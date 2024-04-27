package Strategies;

import Models.ParkingLot;
import Models.ParkingSpot;
import Models.Vehichle;

public interface ParkingSpotAssignmentStrategy {
    ParkingSpot assignParkingSpot(ParkingLot parkingLot, Vehichle vehichle);
}
