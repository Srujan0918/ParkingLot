package Services;

import Exceptions.GateNotFoundException;
import Models.Gate;
import Models.ParkingLot;
import Models.Ticket;
import Models.Vehichle;
import Repositories.GateRepository;
import Repositories.VehichleRepository;
import Strategies.ParkingSpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehichleRepository vehichleRepository;
    private ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy;
    public TicketService(GateRepository gateRepository,VehichleRepository vehichleRepository,ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy){
        this.gateRepository= gateRepository;
        this.vehichleRepository = vehichleRepository;
        this.parkingSpotAssignmentStrategy = parkingSpotAssignmentStrategy;
    }

    public Ticket IssueTicket(String vehichlenumber,
                              String ownername,
                              Long gateid,
                              Long operatorid) throws GateNotFoundException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gate> gate = gateRepository.findbyGateId(gateid);

        if(gate.isEmpty()){
            throw new GateNotFoundException("Invalid Gate id passed");
        }

        Gate gate1 = gate.get();
        ticket.setGate(gate1);
        ticket.setOperator(gate1.getOperator());

        Optional<Vehichle> optionalVehichle = vehichleRepository.findmyVehichleNumber(vehichlenumber);
        Vehichle vehichle = null;
        if(optionalVehichle.isEmpty()){
            vehichle = new Vehichle();
            vehichle.setVehichlenum(vehichlenumber);
            vehichle.setOwner(ownername);
            vehichle = vehichleRepository.save(vehichle);
        }else{
            vehichle = optionalVehichle.get();
        }
        ticket.setVehichle(vehichle);

        ParkingLot parkingLot = gate1.getParkingLot();

        ticket.setParkingSpot(parkingSpotAssignmentStrategy.assignParkingSpot(parkingLot,vehichle));

        return ticket;
    }
}
