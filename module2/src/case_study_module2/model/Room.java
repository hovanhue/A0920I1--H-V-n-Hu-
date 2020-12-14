package case_study_module2.model;

public class Room extends Services{

    public Room(String nameService, double areaUsed, double cost, int maxPerson, String typeRental){
        super(nameService, areaUsed, cost, maxPerson, typeRental);
    }
    public Room(){
        this.nameService = "Room";
        this.areaUsed = 50;
        this.cost = 100;
        this.maxPerson=10;
        this.typeRental ="10 ngày";
    }

    public void showInfo(){
        System.out.println("--------------------Thông tin của dịch vụ--------------------");
        super.showInfo();
        System.out.println("Dịch vụ đi kèm miễn phí");
    }
    public static void main(String[] args) {

    }
}
