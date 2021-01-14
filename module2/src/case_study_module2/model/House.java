package case_study_module2.model;

import java.util.Scanner;

public class House extends Services {
    private String standardRoom;
    private String amenitiesOther;
    private int floors;

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public void setAmenitiesOther(String amenitiesOther) {
        this.amenitiesOther = amenitiesOther;
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

    public int getFloors() {
        return floors;
    }

    public House() {
        super();
        setStandardRoom("4 sao");
        setAmenitiesOther("Không có");
        setFloors(10);
    }

    public House(String id,String nameService, double areaUsed, double cost, int maxPerson, String typeRental, String standardRoom, String amenitiesOther, int floors) {
        super(id,nameService, areaUsed, cost, maxPerson, typeRental);
        this.standardRoom = standardRoom;
        this.amenitiesOther = amenitiesOther;
        this.floors = floors;
    }

    public void input(){
        System.out.println("---------------House---------------");
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tiêu chuẩn: ");
        standardRoom = scanner.nextLine();
        System.out.print("Mô tả các tiện nghi khác: ");
        amenitiesOther  = scanner.next();
        System.out.print("Nhập số tầng: ");
        floors = scanner.nextInt();

    }

    public String showInfo() {
        String s = "";
        s+="\n--------------------Thông tin của dịch vụ (House)--------------------";
        s+="\n"+super.showInfo();
        s+="\nTiêu chuẩn phòng: " + this.getStandardRoom();
        s+="\nTiện nghi khác: " + this.getAmenitiesOther();
        s+="\nSố tầng: " + this.getFloors();
        return s;
    }

    public static void main(String[] args) {
        House house = new House();
        house.input();
        house.showInfo();
    }
}
