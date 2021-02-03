package controllers.customer;

import commons.FileUntil;
import controllers.fileUtill.ReadFile;
import controllers.regular_exception.RegularExpression;
import models.Customer;
import Exception.*;

import static controllers.menu_main.MainConTroller.scanner;

public class Add_Customer {
    public static void addNewCustomer(){
        boolean isValid;

        String fullName;
        String dateOfBirth;
        String gender;
        String idCard;
        String phoneNumber;
        String email;
        String customerType;

        do {
            isValid = true;
            System.out.println("Enter the full name Customer");
            fullName = scanner.nextLine();
            try {
                RegularExpression.validateNameCustomer(fullName);
            } catch (NameException e) {
                System.out.println(e.getMessage());
                isValid = false;
            }
        } while (!isValid);

        do {
            isValid = true;
            System.out.println("Enter the date of birth");
            dateOfBirth = scanner.nextLine();
            try {
                RegularExpression.validateDateOfBirth(dateOfBirth);
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
                isValid = false;
            }
        } while (!isValid);

        do {
            isValid = true;
            System.out.println("Enter the Gender");
            gender = scanner.nextLine();
            try {
                RegularExpression.validateGender(gender.toLowerCase());
            } catch (GenderException e) {
                System.out.println(e.getMessage());
                isValid = false;
            }
        } while (!isValid);

        do {
            isValid = true;
            System.out.println("Enter the number of id Card");
            idCard = scanner.nextLine();
            try {
                RegularExpression.validateIdCard(idCard);
            } catch (IdCardException e) {
                System.out.println(e.getMessage());
                isValid = false;
            }
        } while (!isValid);

        do {
            isValid = true;
            System.out.println("Enter the phone number");
            phoneNumber = scanner.nextLine();
            try {
                RegularExpression.validatePhoneNumber(phoneNumber);
            } catch (PhoneNumberException e) {
                System.out.println(e.getMessage());
                isValid = false;
            }
        } while (!isValid);

        do {
            isValid = true;
            System.out.println("Enter the Email");
            email = scanner.nextLine();
            try {
                RegularExpression.validateEmail(email);
            } catch (EmailException e) {
                System.out.println(e.getMessage());
                isValid = false;
            }
        } while (!isValid);


        System.out.println("Enter the address");
        String address = scanner.nextLine();


        do {
            isValid = true;
            System.out.println("Enter the type of Customer");
            customerType = scanner.nextLine();
            try {
                RegularExpression.validateCustomerType(customerType);
            } catch (CustomerInformationException e) {
                System.out.println(e.getMessage());
                isValid = false;
            }
        } while (!isValid);


        Customer customer = new Customer(fullName, dateOfBirth, gender, idCard, phoneNumber
                , email, address, customerType);

        String line = customer.addInformationCustomerCsv();

        FileUntil.writeInFile(ReadFile.PATH_FILE_CUSTOMER, line);

        System.out.println("Đẫ thêm thành công!");

    }
}
