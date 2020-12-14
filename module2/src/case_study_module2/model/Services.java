package case_study_module2.model;

public class Services {
    protected String nameService;
    protected double areaUsed;
    protected double cost;
    protected int maxPerson;
    protected String typeRental;

    public Services () {
        this.nameService= "";
        this.areaUsed = 1;
        this.cost = 1;
        this.maxPerson=1;
        this.typeRental = "";
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    public String getNameService() {
        return nameService;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public double getCost() {
        return cost;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public Services (String nameService, double areaUsed, double cost, int maxPerson, String typeRental) {
        this.nameService= nameService;
        this.areaUsed = areaUsed;
        this.cost = cost;
        this.maxPerson=maxPerson;
        this.typeRental = typeRental;
    }

    public void showInfo(){
        System.out.println("Tên dịch vụ: "+this.getNameService());
        System.out.println("Diện tích sử dùng: "+this.getAreaUsed());
        System.out.println("Chi phí: "+this.getCost());
        System.out.println("Số lượng người tối đa: "+this.getMaxPerson());
        System.out.println("Kiểu thuê: "+this.getTypeRental());

    }

    public static void main(String[] args) {
        Services services = new Services();
        services.setNameService("abc");
        services.setAreaUsed(100);
        services.setCost(1000);
        services.setMaxPerson(10);
        services.setTypeRental("1/1/2001");
        services.showInfo();
    }
}
