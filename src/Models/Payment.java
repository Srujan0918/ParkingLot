package Models;

import java.util.Date;

public class Payment {
    private int Amount;
    private PaymentMode paymentMode;
    private Date time;
    private PaymentStatus paymentStatus;
    private String Refnumber;

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getRefnumber() {
        return Refnumber;
    }

    public void setRefnumber(String refnumber) {
        Refnumber = refnumber;
    }
}
