package models;

import controllers.menu_main.MainConTroller;

import java.util.Collections;

import static controllers.menu_main.MainConTroller.COMMA;

public class Customer implements Comparable<Customer>{
    //1.	Tạo class có tên là Customer với các thuộc tính như sau:
    // Họ tên Customer, Ngày sinh, Giới tính, Số CMND, Số ĐT, Email, Loại khách,
    // Địa chỉ và thuộc tính sử dụng dịch vụ có kiểu đối tượng là Services, và phương thức showInfor().
    private String name;
    private String dayOfBirth;
    private String sex;
    private String  identity;
    private String  phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private Services service;

    public Customer(String name, String dayOfBirth, String sex, String  identity, String  phoneNumber, String email, String typeCustomer, String address) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.sex = sex;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;

    }

    public Customer(String fullName, String dateOfBirth, String gender, String idCard, String numberPhone, String email, String address, String customerType, Services service) {
        this.name = fullName;
        this.dayOfBirth = dateOfBirth;
        this.sex = gender;
        this.identity = idCard;
        this.phoneNumber = numberPhone;
        this.email = email;
        this.typeCustomer = customerType;
        this.address = address;
        this.service = service;
    }
    public Customer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String showInfor(){
        String s = "";
        s+="\nName: "+this.getName();
        s+="\nDate of birth: "+this.getDayOfBirth();
        s+="\nSex: "+this.getSex();
        s+="\nIdentity: "+this.getIdentity();
        s+="\nNumber phone: "+this.getPhoneNumber();
        s+="\nEmail: "+this.getEmail();
        s+="\nType Customer: "+this.getTypeCustomer();
        s+="\nAddress: "+this.getAddress();
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Customer)){
            return false;
        }

        Customer customer = (Customer) obj;

        if(this.name.equals(customer.getName())){
            return true;
        }
        return false;
    }

    public String addInformationCustomerCsv(){
        return this.getName() + COMMA +
                this.getDayOfBirth() + COMMA +
                this.getSex() + COMMA +
                this.getIdentity() + COMMA +
                this.getPhoneNumber() + COMMA +
                this.getEmail() + COMMA +
                this.getAddress() + COMMA +
                this.getTypeCustomer();
    }

    @Override
    public int compareTo(Customer customer) {
        return this.name.compareTo(customer.getName());
    }
}
