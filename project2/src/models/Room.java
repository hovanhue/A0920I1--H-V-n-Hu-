package models;

public class Room extends Services{
    private String freeService;

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public Room() {

    }

    public Room(String id, String nameService, double areaUsed, double cost, int numberMaxPerson, String typeService, String freeService) {
        super(id, nameService, areaUsed, cost, numberMaxPerson, typeService);
        this.freeService = freeService;
    }

    @Override
    public String showInfor() {
        String s ="";
        s +="ID: "+super.getId()+" Tên dịch vụ: "+super.getNameService()
                +" Diện tích sử dụng: "+super.getAreaUsed()+" Chi phí thuê: "+super.getCost()
                +" Số lượng người tối đa: "+super.getNumberMaxPerson()+" Kiểu thuê: "+ super.getTypeService()+" Tiêu chuẩn phòng: "
               +" Dịch vụ đi kèm"+this.getFreeService();
        return s;
    }
}
