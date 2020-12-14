package case_study_module2.model;

public class House extends Services{
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

    public House(){
        setNameService("House");
        setAreaUsed(50);
        setCost(100);
        setMaxPerson(10);
        setTypeRental("10 ngày");
        setStandardRoom("4 sao");
        setAmenitiesOther("Không có");
        setFloors(10);
    }
    public void showInfo(){
        System.out.println("--------------------Thông tin của dịch vụ--------------------");
        super.showInfo();
        System.out.println("Tiêu chuẩn phòng: "+this.getStandardRoom());
        System.out.println("Tiện nghi khác: "+this.getAmenitiesOther());
        System.out.println("Số tầng: "+this.getFloors());
    }

    public static void main(String[] args) {
        House house =new House();
        house.showInfo();
    }
}
