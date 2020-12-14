package case_study_module2.model;

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

    public Villa(){
        this.nameService = "Villa";
        this.areaUsed = 50;
        this.cost = 100;
        this.maxPerson=10;
        this.typeRental ="10 ngày";
        this.standardRoom="4 sao";
        this.amenitiesOther="Không có";
        this.areaPool=50.0;
        this.floors=10;
    }

    public Villa(String nameService, double areaUsed, double cost, int maxPerson, String typeRental, String standardRoom,String amenitiesOther, double areaPool, int floors){
        super(nameService, areaUsed, cost, maxPerson, typeRental);
        this.standardRoom=standardRoom;
        this.amenitiesOther=amenitiesOther;
        this.areaPool=areaPool;
        this.floors=floors;
    }

    public void showInfo(){
        System.out.println("--------------------Thông tin của dịch vụ--------------------");
        super.showInfo();
        System.out.println("Tiêu chuẩn phòng: "+this.getStandardRoom());
        System.out.println("Tiện nghi khác: "+this.getAmenitiesOther());
        System.out.println("Diện tích hồ bơi: "+this.getAreaPool());
        System.out.println("Số tầng: "+this.getFloors());
    }

    public static void main(String[] args) {
        Villa villa = new Villa();
        villa.setStandardRoom("5 sao");
        villa.setAmenitiesOther("Không có");
        villa.setAreaPool(45.0);
        villa.setFloors(10);
        villa.showInfo();
    }
}
