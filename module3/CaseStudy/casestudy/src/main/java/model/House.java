package model.service;

public class House extends Service{
    private String standradRoom;
    private String descriptionOther;
    private int numberFloors;

    public House() {
    }

    public House(String nameService, double serviceArea, double serviceCost, int maxPeople, String typeRent, String standradRoom, String descriptionOther, int numberFloors) {
        super(nameService, serviceArea, serviceCost, maxPeople, typeRent);
        standradRoom = standradRoom;
        this.descriptionOther = descriptionOther;
        this.numberFloors = numberFloors;
    }

    public String getStandradRoom() {
        return standradRoom;
    }

    public void setStandradRoom(String standradRoom) {
        standradRoom = standradRoom;
    }

    public String getDescriptionOther() {
        return descriptionOther;
    }

    public void setDescriptionOther(String descriptionOther) {
        this.descriptionOther = descriptionOther;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "nameService='" + getNameService() + '\'' +
                ", serviceArea=" + getNameService() +
                ", serviceCost=" + getServiceCost() +
                ", maxPeople=" + getMaxPeople() +
                ", typeRent='" + getTypeRent() + '\'' +
                "standradRoom='" + standradRoom + '\'' +
                ", descriptionOther='" + descriptionOther + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
