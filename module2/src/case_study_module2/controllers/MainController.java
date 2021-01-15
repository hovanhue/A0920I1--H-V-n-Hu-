package case_study_module2.Controllers;

import case_study_module2.model.House;
import case_study_module2.model.Room;
import case_study_module2.model.Services;
import case_study_module2.model.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Services> arrList;
    static int choose = 0;

    public static void addNewServies() {
        choose = 0;
        do {
            System.out.println("1.Add New Villa");
            System.out.println("2.Add New House");
            System.out.println("3.Add New Room");
            System.out.println("4.Back to menu");
            System.out.println("5.Exit");
            choose = scanner.nextInt();

            //D:\A0920I- HoVanHue\module2

            switch (choose) {
                case 1:
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\A0920I- HoVanHue\\module2\\src\\case_study_module2\\data\\Villa.csv"))) {
                        Villa villa = new Villa();

                        villa.input();

                        bw.write("" + villa.showInfo());
                        bw.close();

                        System.out.println("Write the file successfully!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    addNewServies();
                    break;
                case 2:
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\A0920I- HoVanHue\\module2\\src\\case_study_module2\\data\\House.csv"))) {
                        House house = new House();

                        house.input();
                        bw.write("" + house.showInfo());
                        bw.close();

                        System.out.println("Write the file successfully!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    addNewServies();
                    break;
                case 3:
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\A0920I- HoVanHue\\module2\\src\\case_study_module2\\data\\Room.csv"))) {
                        Room room = new Room();

                        room.input();
                        bw.write("" + room.showInfo());
                        bw.close();

                        System.out.println("Write the file successfully!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    addNewServies();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Bạn vui lòng chọn các thao tác dưới đây");
            }
        } while (choose < 0 || choose > 5);
        scanner.close();
    }


    public static void displayMainMenu() {
        choose = 0;
        System.out.println(" -----------------Khu nghỉ dưỡng Furama-----------------");
        System.out.println("1.Add New Services");
        System.out.println("2.Show Services");
        System.out.println("3.Add New Customer");
        System.out.println("4.Show Information of Customer");
        System.out.println("5.Add New Booking");
        System.out.println("6.Show Information of Employee");
        System.out.println("7.Exit");
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewServies();
                break;
            case 2:
                showServices();
                break;
            case 3:

            case 4:

            case 5:

            case 6:

            case 7:
                System.exit(0);
            default:
                System.out.println("Hiện tại hệ thống chỉ chưa có chức năng này, vui lòng chọn lại!");
        }

    }
    
    public static void showServices() {
        choose = 0;
        do {
            System.out.println("1. Show all Villa");
            System.out.println("2. Show all House");
            System.out.println("3. Show all Room");
            System.out.println("4. Show All Name Villa Not Duplicate");
            System.out.println("5. Show All Name House Not Duplicate");
            System.out.println("6. Show All Name Name Not Duplicate");
            System.out.println("7. Back to menu");
            System.out.println("8. Exit");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    Villa villa = new Villa();
                    System.out.println(villa.showInfo());
                    showServices();
                    break;

                case 2:
                    House house = new House();
                    System.out.println(house.showInfo());
                    showServices();
                    break;
                case 3:
                    Room room = new Room();
                    System.out.println(room.showInfo());
                    showServices();
                    break;
                case 4:

                case 5:

                case 6:

                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    System.exit(0);
                default:
            }

        } while (choose < 0 || choose > 8);
    }


    public static void main(String[] args) {
        displayMainMenu();
    }
}
