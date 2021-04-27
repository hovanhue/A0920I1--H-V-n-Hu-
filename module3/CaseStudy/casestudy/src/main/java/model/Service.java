package model.service;

public abstract class Service {
    private String nameService;
    private double serviceArea;
    private double serviceCost;
    private int maxPeople;
    private String typeRent;

    public Service() {
    }

    public Service(String nameService, double serviceArea, double serviceCost, int maxPeople, String typeRent) {
        this.nameService = nameService;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(double serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Service{" +
                "nameService='" + nameService + '\'' +
                ", serviceArea=" + serviceArea +
                ", serviceCost=" + serviceCost +
                ", maxPeople=" + maxPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
