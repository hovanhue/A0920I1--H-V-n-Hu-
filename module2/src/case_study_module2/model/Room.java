package case_study_module2.model;

public class Room extends Services {

    public Room(String id,String nameService, double areaUsed, double cost, int maxPerson, String typeRental) {
        super(id,nameService, areaUsed, cost, maxPerson, typeRental);
    }

    public Room() {
       super();
    }

    public void input(){
        System.out.println("---------------Room---------------");
        super.input();
    }

    public String showInfo() {
        String s ="";
        s+="\n--------------------Thông tin của dịch vụ (Room)--------------------";
        s+="\n"+super.showInfo();
        s+="\nDịch vụ đi kèm miễn phí";
        return s;
    }

    public static void main(String[] args) {

    }
}
