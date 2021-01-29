package models;

public abstract class Services {
    private String id;
    private String nameService;
    private double areaUsed;
    private double cost;
    private int numberMaxPerson;
    private String typeService;

    public abstract String showInfor();


    public Services(String id, String nameService, double areaUsed, double cost, int numberMaxPerson, String typeService) {
        this.id = id;
        this.nameService = nameService;
        this.areaUsed = areaUsed;
        this.cost = cost;
        this.numberMaxPerson = numberMaxPerson;
        this.typeService = typeService;
    }

    public Services(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberMaxPerson() {
        return numberMaxPerson;
    }

    public void setNumberMaxPerson(int numberMaxPerson) {
        this.numberMaxPerson = numberMaxPerson;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

}
