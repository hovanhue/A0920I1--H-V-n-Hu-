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
    private String employeeEducationDegree;
    private String employeePosition;
    private String employeeDivision;
    private String employeeUserName;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeBirthday, String employeeIDCard, double employeeSalary, String employeePhone, String employeeEmail, String employeeAddress, String employeeEducationDegree, String employeePosition, String employeeDivision, String employeeUserName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIDCard = employeeIDCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.employeeEducationDegree = employeeEducationDegree;
        this.employeePosition = employeePosition;
        this.employeeDivision = employeeDivision;
        this.employeeUserName = employeeUserName;
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

    public String getEmployeeEducationDegree() {
        return employeeEducationDegree;
    }

    public void setEmployeeEducationDegree(String employeeEducationDegree) {
        this.employeeEducationDegree = employeeEducationDegree;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public String getEmployeeDivision() {
        return employeeDivision;
    }

    public void setEmployeeDivision(String employeeDivision) {
        this.employeeDivision = employeeDivision;
    }

    public String getEmployeeUserName() {
        return employeeUserName;
    }

    public void setEmployeeUserName(String employeeUserName) {
        this.employeeUserName = employeeUserName;
    }
}
