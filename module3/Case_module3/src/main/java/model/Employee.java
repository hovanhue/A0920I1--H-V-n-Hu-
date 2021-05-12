package model;

public class Employee {
    //Họ tên Employee (employee_name), Ngày sinh (employee_birthday), Số CMND (employee_id_card), Số ĐT (employee_phone),
    // Email (employee_email), Trình độ (education_degree_id), Vị trí (position_id), Lương (employee_salary).
    private int employeeId;
    private String employeeName;
    private String employeeBirthday;
    private String employeeIDCard;
    private double employeeSalary;
    private String employeePhone;
    private String employeeEmail;
    private String employeeAddress;
    private int employeePosition;
    private int employeeEducationDegree;
    private int employeeDivision;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Employee() {
    }

    public Employee(String employeeName, String employeeBirthday, String employeeIDCard, double employeeSalary, String employeePhone, String employeeEmail, String employeeAddress, int employeePosition, int employeeEducationDegree, int employeeDivision, String userName) {
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIDCard = employeeIDCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.employeePosition = employeePosition;
        this.employeeEducationDegree = employeeEducationDegree;
        this.employeeDivision = employeeDivision;
        this.userName = userName;
    }

    public Employee(int employeeId, String employeeName, String employeeBirthday, String employeeIDCard, double employeeSalary, String employeePhone, String employeeEmail, String employeeAddress, int employeePosition, int employeeEducationDegree, int employeeDivision, String userName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIDCard = employeeIDCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.employeePosition = employeePosition;
        this.employeeEducationDegree = employeeEducationDegree;
        this.employeeDivision = employeeDivision;
        this.userName = userName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIDCard() {
        return employeeIDCard;
    }

    public void setEmployeeIDCard(String employeeIDCard) {
        this.employeeIDCard = employeeIDCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(int employeePosition) {
        this.employeePosition = employeePosition;
    }

    public int getEmployeeEducationDegree() {
        return employeeEducationDegree;
    }

    public void setEmployeeEducationDegree(int employeeEducationDegree) {
        this.employeeEducationDegree = employeeEducationDegree;
    }

    public int getEmployeeDivision() {
        return employeeDivision;
    }

    public void setEmployeeDivision(int employeeDivision) {
        this.employeeDivision = employeeDivision;
    }
}