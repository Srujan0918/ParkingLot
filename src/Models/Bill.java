package Models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private int Billnum;
    private Ticket ticket;
    private int Amount;
    private Date ExitTime;
    private Gate gate;
    private Operator operator;
    private BillStatus billStatus;

    private List<Payment> payments;

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public int getBillnum() {
        return Billnum;
    }

    public void setBillnum(int billnum) {
        Billnum = billnum;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public Date getExitTime() {
        return ExitTime;
    }

    public void setExitTime(Date exitTime) {
        ExitTime = exitTime;
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

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
