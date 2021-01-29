package models;

public class House extends Services{
    private String standardService;
    private String otherService;
    private int floor;
    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.


    public String getStandardService() {
        return standardService;
    }

    public void setStandardService(String standardService) {
        this.standardService = standardService;
    }

    public String getOtherService() {
        return otherService;
    }

    public void setOtherService(String otherService) {
        this.otherService = otherService;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public House(String id, String nameService, double areaUsed, double cost, int numberMaxPerson, String typeService, String standardService, String otherService, int floor) {
        super(id, nameService, areaUsed, cost, numberMaxPerson, typeService);
        this.standardService = standardService;
        this.otherService = otherService;
        this.floor = floor;
    }

    public House() {

    }
    @Override
    public String showInfor(){
        String s ="";
        s +="ID: "+super.getId()+" Tên dịch vụ: "+super.getNameService()
                +" Diện tích sử dụng: "+super.getAreaUsed()+" Chi phí thuê: "+super.getCost()
                +" Số lượng người tối đa: "+super.getNumberMaxPerson()+" Kiểu thuê: "+ super.getTypeService()+" Tiêu chuẩn phòng: "
                +this.getStandardService() +" Mô tả tiện nghi khác: "+this.getOtherService()
                +" Số tầng: "+this.getFloor();
        return s;
    }
}
