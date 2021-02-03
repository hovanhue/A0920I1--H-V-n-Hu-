package models;

public class Employee {
    //họ tên Employee , Ngày sinh, Số CMND, Số ĐT, Email, Trình độ, Vị trí, lương
    private String name;
    private String dayOfBirth;
    private String identity;
    private String phoneNumber;
    private String email;
    private String level;
    private String location;
    private String salary;

    public Employee(String name, String dayOfBirth, String identity, String phoneNumber, String email, String level, String location, String salary) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(){ }

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", identity=" + identity +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
