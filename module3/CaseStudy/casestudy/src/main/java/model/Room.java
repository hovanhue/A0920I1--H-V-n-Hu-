package model.service;

public class Room extends Service{
    private String serviceFree;

    public Room() {
    }

    public Room(String nameService, double serviceArea, double serviceCost, int maxPeople, String typeRent, String serviceFree) {
        super(nameService, serviceArea, serviceCost, maxPeople, typeRent);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nameService='" + getNameService() + '\'' +
                ", serviceArea=" + getNameService() +
                ", serviceCost=" + getServiceCost() +
                ", maxPeople=" + getMaxPeople() +
                ", typeRent='" + getTypeRent() + '\'' +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
}
