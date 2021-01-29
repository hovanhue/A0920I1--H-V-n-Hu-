package controllers;

import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainConTroller {
    static int choose = 0;
    static Scanner scanner = new Scanner(System.in);
    public static final String COMMA = ",";
    static List<Services> servicesList = new ArrayList<>();

    public static void displayMainMenu() {
        choose = 0;
        do {
            System.out.println("1. Add New Services");
            System.out.println("2. Show Services");
            System.out.println("3. Add New Customer");
            System.out.println("4. Show Information of Customer");
            System.out.println("5. Add New Booking");
            System.out.println("6. Show Information of Employee");
            System.out.println("7. Exit");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    addNewServices();
                    break;
                case 2:
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    showServices();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    System.exit(0);
            }
        } while (choose < 0 || choose > 7);
    }

    private static void showServices() {
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
                case 2:
                case 3:
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

    public static void addNewServices() {
        choose = 0;
        do {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Nhập id: ");
                    String id1 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập tên dịch vụ: ");
                    String name1 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập diện tích sử dụng: ");
                    double areaUsed1 = scanner.nextDouble();
                    System.out.print("Nhập chi phí: ");
                    double cost1 = scanner.nextDouble();
                    System.out.print("Nhập tối đa đi bao nhiêu người: ");
                    int maxPerson1 = scanner.nextInt();
                    System.out.print("Nhập Kiểu thuê: ");
                    String type1 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập Tiêu chuẩn: ");
                    String standardService1 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập Dịch vụ khác: ");
                    String otherService1 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập diện tích hồ bơi: ");
                    double areaPool1 = scanner.nextDouble();
                    System.out.print("Nhập số tầng: ");
                    int floor1 = scanner.nextInt();
                    Villa villa = new Villa(id1, name1, areaUsed1, cost1, maxPerson1, type1, standardService1, otherService1, areaPool1, floor1);

                    servicesList.add(villa);
                    WriteFIle.writeCSV("src/data/Villa.csv", villa, true);
                    System.out.println("Đã thêm thành công!!");
                    addNewServices();
                    break;
                case 2:
                    System.out.print("Nhập id: ");
                    String id3 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập tên dịch vụ: ");
                    String name3 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập diện tích sử dụng: ");
                    double areaUsed3 = scanner.nextDouble();
                    System.out.print("Nhập chi phí: ");
                    double cost3 = scanner.nextDouble();
                    System.out.print("Nhập tối đa đi bao nhiêu người: ");
                    int maxPerson3 = scanner.nextInt();
                    System.out.print("Nhập Kiểu thuê: ");
                    String type3 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập Tiêu chuẩn: ");
                    String standardService3 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập Dịch vụ khác: ");
                    String otherService3 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập số tầng: ");
                    int floor3 = scanner.nextInt();
                    House house = new House(id3, name3, areaUsed3, cost3, maxPerson3, type3, standardService3, otherService3, floor3);
                    servicesList.add(house);
                    WriteFIle.writeCSV("src/data/House.csv", house, true);
                    System.out.println("Đã thêm thành công!!");
                    addNewServices();
                    break;
                case 3:
                    System.out.print("Nhập id: ");
                    String id2 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập tên dịch vụ: ");
                    String name2 = scanner.nextLine();
                    scanner.next();
                    System.out.print("Nhập diện tích sử dụng: ");
                    double areaUsed2 = scanner.nextDouble();
                    System.out.print("Nhập chi phí: ");
                    double cost2 = scanner.nextDouble();
                    System.out.print("Nhập tối đa đi bao nhiêu người: ");
                    int maxPerson2 = scanner.nextInt();
                    System.out.print("Nhập Kiểu thuê: ");
                    String type2 = scanner.nextLine();
                    scanner.next();
                    String freeService = "DỊch vụ đi kèm miễn phí!";
                    Room room = new Room(id2, name2, areaUsed2, cost2, maxPerson2, type2, freeService);

                    servicesList.add(room);
                    WriteFIle.writeCSV("src/data/Room.csv", room, true);
                    System.out.println("Đã thêm thành công!!");
                    addNewServices();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);

            }
        } while (choose < 0 || choose > 5);
    }

    public static void main(String[] args) {
        displayMainMenu();
//        addNewServices();
    }
}
