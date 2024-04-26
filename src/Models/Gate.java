package Models;

public class Gate extends BaseModel{
    private int gatenum;
    private Operator operator;
    private GateStatus status;
    private GateType gateType;

    public int getGatenum() {
        return gatenum;
    }

    public void setGatenum(int gatenum) {
        this.gatenum = gatenum;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
