package Models;

import java.util.Date;

public class Ticket extends BaseModel{
    private String num;
    private Date entryTime;
    private Vehichle vehichle;
    private ParkingSpot parkingSpot;
    private Gate gate;
    private Operator operator;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehichle getVehichle() {
        return vehichle;
    }

    public void setVehichle(Vehichle vehichle) {
        this.vehichle = vehichle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
