package model;

public class Villa extends Service {
    // Tiêu chuẩn phòng (standard_room), Mô tả tiện nghi khác (description_other_convenience),
    // Diện tích hồ bơi (pool_area), Số tầng (number_of_floors).
    private String StandradRoom;
    private String descriptionOther;
    private double poolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String nameService, double serviceArea, double serviceCost, int maxPeople, String typeRent, String standradRoom, String descriptionOther, double poolArea, int numberFloors) {
        super(nameService, serviceArea, serviceCost, maxPeople, typeRent);
        StandradRoom = standradRoom;
        this.descriptionOther = descriptionOther;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getStandradRoom() {
        return StandradRoom;
    }

    public void setStandradRoom(String standradRoom) {
        StandradRoom = standradRoom;
    }

    public String getDescriptionOther() {
        return descriptionOther;
    }

    public void setDescriptionOther(String descriptionOther) {
        this.descriptionOther = descriptionOther;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "nameService='" + getNameService() + '\'' +
                ", serviceArea=" + getNameService() +
                ", serviceCost=" + getServiceCost() +
                ", maxPeople=" + getMaxPeople() +
                ", typeRent='" + getTypeRent() + '\'' +
                "StandradRoom='" + StandradRoom + '\'' +
                ", descriptionOther='" + descriptionOther + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
