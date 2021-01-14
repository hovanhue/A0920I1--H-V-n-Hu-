package case_study_module2.model;

import java.util.Scanner;

public abstract class Services {
    protected String id;
    protected String nameService;
    protected double areaUsed;
    protected double cost;
    protected int maxPerson;
    protected String typeRental;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Services() {
        this.id = "01";
        this.nameService = "Dịch vụ";
        this.areaUsed = 1.0;
        this.cost = 1.0;
        this.maxPerson = 1;
        this.typeRental = "Ngày";
    }

    public Services(String id, String nameService, double areaUsed, double cost, int maxPerson, String typeRental) {
        this.id = id;
        this.nameService = nameService;
        this.areaUsed = areaUsed;
        this.cost = cost;
        this.maxPerson = maxPerson;
        this.typeRental = typeRental;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
//        do {
            System.out.print("Nhập id: ");
            id = scanner.nextLine();
//            if (id == this.getId()){
//                System.out.println("ID "+id +" đã có, bạn nhập lại ID khác");
//            }
//        }while (id == this.getId());
        System.out.print("Nhập tên dịch vụ: ");
        nameService = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        areaUsed = scanner.nextDouble();
        System.out.print("Nhập chi phí: ");
        cost = scanner.nextDouble();
        System.out.print("Nhập số lượng người đi: ");
        maxPerson = scanner.nextInt();
        System.out.print("Nhập kiểu thuê: ");
        typeRental = scanner.next();
    }

//    public void showInfo() {
//        System.out.println("\n------------------------------");
//        System.out.println("ID: " + this.getId());
//        System.out.println("Tên dịch vụ: " + this.getNameService());
//        System.out.println("Diện tích sử dùng: " + this.getAreaUsed());
//        System.out.println("Chi phí: " + this.getCost());
//        System.out.println("Số lượng người tối đa: " + this.getMaxPerson());
//        System.out.println("Kiểu thuê: " + this.getTypeRental());
//    }

    public String showInfo() {
        String s = "";
        s += "\n------------------------------";
        s += "\nID: " + this.getId();
        s += "\nTên dịch vụ: " + this.getNameService();
        s += "\nDiện tích sử dùng: " + this.getAreaUsed();
        s += "\nChi phí: " + this.getCost();
        s += "\nSố lượng người tối đa: " + this.getMaxPerson();
        s += "\nKiểu thuê: " + this.getTypeRental();
        return s;
    }

}
