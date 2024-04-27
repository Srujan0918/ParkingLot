package DTOs;

public class IssueTicketRequestDTO {
    private String vehichlenumber;
    private String ownerName;
    private Long gateId;
    private Long OperatorId;

    public String getVehichlenumber() {
        return vehichlenumber;
    }

    public void setVehichlenumber(String vehichlenumber) {
        this.vehichlenumber = vehichlenumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public Long getOperatorId() {
        return OperatorId;
    }

    public void setOperatorId(Long operatorId) {
        OperatorId = operatorId;
    }
}
