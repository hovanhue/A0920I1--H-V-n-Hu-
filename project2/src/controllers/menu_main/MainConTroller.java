package controllers.menu_main;

import controllers.employee.ShowEmployee;

import java.util.*;

import static controllers.booking.AddBooking.addNewBooking;
import static controllers.customer.Add_Customer.addNewCustomer;
import static controllers.customer.Show_Customer.showInformationCustomers;
import static controllers.employee.ShowEmployee.showInforEmployee;
import static controllers.service.Add_Service.addNewServices;
import static controllers.service.Show_Service.showServices;


public class MainConTroller {
    public static Scanner scanner = new Scanner(System.in);
    public static final String COMMA = ",";

    public static void displayMainMenu() {
        String choose;
        do {
            System.out.println("1. Add New Services");
            System.out.println("2. Show Services");
            System.out.println("3. Add New Customer");
            System.out.println("4. Show Information of Customer");
            System.out.println("5. Add New Booking");
            System.out.println("6. Show Information of Employee");
            System.out.println("7. Exit");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addNewServices();
                    break;
                case "2":
                    showServices();
                    break;
                case "3":
                    addNewCustomer();
                    displayMainMenu();
                    break;
                case "4":
                    showInformationCustomers();
                    displayMainMenu();
                    break;
                case "5":
                    addNewBooking();
                    displayMainMenu();
                    break;
                case "6":
                    showInforEmployee();
                    break;
                case "7":
                    System.exit(0);
            }
        } while (Integer.parseInt(choose) < 0 || Integer.parseInt(choose) > 7);
    }


    public static void main(String[] args) {
        displayMainMenu();
    }
}
