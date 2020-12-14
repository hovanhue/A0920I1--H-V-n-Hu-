package case_study_module2.Controllers;

import java.util.Scanner;

public class MainController {

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println(" -----------------Khu nghỉ dưỡng Furama-----------------");
            System.out.println("1.Add New Services");
            System.out.println("2.Show Services");
            System.out.println("3.Add New Customer");
            System.out.println("4.Show Information of Customer");
            System.out.println("5.Add New Booking");
            System.out.println("6.Show Information of Employee");
            System.out.println("7.Exit");
        } while (choose < 0 || choose > 7);
    }

    public static void main(String[] args) {

    }
}
