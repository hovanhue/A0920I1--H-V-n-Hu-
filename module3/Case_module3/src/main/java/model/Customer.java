package model;

public class Customer {
    //: Họ tên Customer (customer_name), Ngày sinh (customer_birthday), Giới tính (customer_gender), Số CMND (customer_id_card),
    // ]Số Điện Thoại (customer_phone), Email (customer_email), Loại khách (customer_type_id), Địa chỉ (customer_address)
    // (resort sẽ phân loại Customer để áp dụng các chính sách phục vụ cho phù hợp).

    private String customerName;
    private String customerBirthday;
    private String customerGender;
    private String customerIDCard;
    private String customerPhone;
    private String customerEmail;
    private String customerType;
    private String customerAddress;

    public Customer() {
    }

    public Customer(String customerName, String customerBirthday, String customerGender, String customerIDCard, String customerPhone, String customerEmail, String customerType, String customerAddress) {
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIDCard = customerIDCard;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIDCard() {
        return customerIDCard;
    }

    public void setCustomerIDCard(String customerIDCard) {
        this.customerIDCard = customerIDCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
