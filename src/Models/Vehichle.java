package Models;

public class Vehichle extends BaseModel{
    private String vehichlenum;
    private String Owner;
    private VehichleType vehichleType;

    public String getVehichlenum() {
        return vehichlenum;
    }

    public void setVehichlenum(String vehichlenum) {
        this.vehichlenum = vehichlenum;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public VehichleType getVehichleType() {
        return vehichleType;
    }

    public void setVehichleType(VehichleType vehichleType) {
        this.vehichleType = vehichleType;
    }
}
