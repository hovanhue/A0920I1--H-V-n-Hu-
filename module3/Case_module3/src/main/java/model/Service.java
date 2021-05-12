package model;

public class Service {
    private int idService;
    private String nameService;
    private double serviceArea;
    private double serviceCost;
    private int maxPeople;
    private int idTypeRent;
    private int idTypeService;
    private String standardRoom;
    private String descriptionOther;
    private double poolArea;
    private int floors;

    public Service() {
    }

    public Service(String nameService, double serviceArea, double serviceCost, int maxPeople, int idTypeRent, int idTypeService, String standardRoom, String descriptionOther, double poolArea, int floors) {
        this.nameService = nameService;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.maxPeople = maxPeople;
        this.idTypeRent = idTypeRent;
        this.idTypeService = idTypeService;
        this.standardRoom = standardRoom;
        this.descriptionOther = descriptionOther;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Service(int idService, String nameService, double serviceArea, double serviceCost, int maxPeople, int idTypeRent, int idTypeService, String standardRoom, String descriptionOther, double poolArea, int floors) {
        this.idService = idService;
        this.nameService = nameService;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.maxPeople = maxPeople;
        this.idTypeRent = idTypeRent;
        this.idTypeService = idTypeService;
        this.standardRoom = standardRoom;
        this.descriptionOther = descriptionOther;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
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

    public int getIdTypeRent() {
        return idTypeRent;
    }

    public void setIdTypeRent(int idTypeRent) {
        this.idTypeRent = idTypeRent;
    }

    public int getIdTypeService() {
        return idTypeService;
    }

    public void setIdTypeService(int idTypeService) {
        this.idTypeService = idTypeService;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
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

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
