package case_study_module2.model;

import java.util.Scanner;

public class Villa extends Services {
    private String standardRoom;
    private String amenitiesOther;
    private double areaPool;
    private int floors;

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public void setAmenitiesOther(String amenitiesOther) {
        this.amenitiesOther = amenitiesOther;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public String getAmenitiesOther() {
        return amenitiesOther;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public int getFloors() {
        return floors;
    }

    public Villa() {
        super();
        this.standardRoom = "4 sao";
        this.amenitiesOther = "Không có";
        this.areaPool = 50.0;
        this.floors = 10;
    }

    public Villa(String id, String nameService, double areaUsed, double cost, int maxPerson, String typeRental, String standardRoom, String amenitiesOther, double areaPool, int floors) {
        super(id, nameService, areaUsed, cost, maxPerson, typeRental);
        this.standardRoom = standardRoom;
        this.amenitiesOther = amenitiesOther;
        this.areaPool = areaPool;
        this.floors = floors;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------Villa---------------");
        super.input();
        System.out.print("Nhập tiêu chuẩn: ");
        standardRoom = scanner.nextLine();
        System.out.print("Mô tả các tiện nghi khác: ");
        amenitiesOther = scanner.next();
        System.out.print("Nhập diện tích hồ bơi: ");
        areaPool = scanner.nextDouble();
        System.out.print("Nhập số tầng: ");
        floors = scanner.nextInt();

    }

    public String showInfo() {
        String s = "";
        s += "\n--------------------Thông tin của dịch vụ (Villa)--------------------";
        s += "\n" + super.showInfo();
        s += "\nTiêu chuẩn phòng: " + this.getStandardRoom();
        s += "\nTiện nghi khác: " + this.getAmenitiesOther();
        s += "\nDiện tích hồ bơi: " + this.getAreaPool();
        s += "\nSố tầng: " + this.getFloors();
        return s;
    }

    public static void main(String[] args) {
        Villa villa = new Villa();
        villa.input();
//        villa.setStandardRoom("5 sao");
//        villa.setAmenitiesOther("Không có");
//        villa.setAreaPool(45.0);
//        villa.setFloors(1);

        villa.showInfo();
    }
}
