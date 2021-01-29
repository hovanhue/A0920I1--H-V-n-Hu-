package models;

public class Villa extends Services{
    private String standardService;
    private String otherService;
    private double areaPool;
    private int floor;

    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.


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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Villa(String id, String nameService, double areaUsed, double cost, int numberMaxPerson, String typeService, String standardService, String otherService, double areaPool, int floor) {
        super(id, nameService, areaUsed, cost, numberMaxPerson, typeService);
        this.standardService = standardService;
        this.otherService = otherService;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa() {

    }
    @Override
    public String showInfor(){
        String s ="";
        s +="ID: "+super.getId()+" \nTên dịch vụ: "+super.getNameService()
        +" \nDiện tích sử dụng: "+super.getAreaUsed()+" \nChi phí thuê: "+super.getCost()
        +" \nSố lượng người tối đa: "+super.getNumberMaxPerson()+" \nKiểu thuê: "+ super.getTypeService()+" \nTiêu chuẩn phòng: "
        +this.getStandardService() +" \nMô tả tiện nghi khác: "+this.getOtherService()
        +" \nDiện tích hồ bơi: "+this.getAreaPool()+" \nSố tầng: "+this.getFloor();
        return s;
    }
}

