package model;

public class RentType {
    private int rentTypeid;
    private String rentTypeName;
    private double rentTypeCost;

    public RentType() {
    }

    public RentType(int rentTypeid, String rentTypeName, double rentTypeCost) {
        this.rentTypeid = rentTypeid;
        this.rentTypeName = rentTypeName;
        this.rentTypeCost = rentTypeCost;
    }

    public int getRentTypeid() {
        return rentTypeid;
    }

    public void setRentTypeid(int rentTypeid) {
        this.rentTypeid = rentTypeid;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public double getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(double rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }
}
