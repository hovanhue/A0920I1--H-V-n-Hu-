package controllers.booking;

import commons.FileUntil;
import controllers.customer.Show_Customer;
import controllers.fileUtill.ReadFile;
import controllers.menu_main.MainConTroller;
import controllers.regular_exception.RegularExpression;
import controllers.service.Show_Service;

import static controllers.menu_main.MainConTroller.scanner;

public class AddBooking {
    private static String choiceCustomer;
    public static void addNewBooking() {
        String choose ;
        do {
            System.out.println("----------------------------------------");
            System.out.println("1. Booking Villa. ");
            System.out.println("2. Booking House. ");
            System.out.println("3. Booking Room.");
            System.out.println("4. Back to main menu.");
            System.out.println("5. Exit.");
            System.out.println("----------------------------------------");
            System.out.print("Enter your choice : ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    choiceVilla();
                    FileUntil.writeInFile(ReadFile.PATH_FILE_BOOKING, ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).addInformationBooking());
                    System.out.println("SUCCESS");
                    break;
                case "2":
                    choiceHouse();
                    FileUntil.writeInFile(ReadFile.PATH_FILE_BOOKING, ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).addInformationBooking());
                    System.out.println("SUCCESS");
                    break;
                case "3":
                    choiceRoom();
                    FileUntil.writeInFile(ReadFile.PATH_FILE_BOOKING, ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).addInformationBooking());
                    System.out.println("SUCCESS");
                    break;
                case "4":
                    MainConTroller.displayMainMenu();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter 1 to 5");
                    addNewBooking();
                    break;

            }
        }while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) < 6);

    }
    public static void choiceCustomer(){
        Show_Customer.showInformationCustomers();
        boolean flag;

        do {
            System.out.println("choose customer booking");
            choiceCustomer = scanner.nextLine();
            flag = true;
            try {
                RegularExpression.indexCustomerException(choiceCustomer);
            }catch (IndexOutOfBoundsException e ){
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);

    }

    public static void choiceVilla() {
        choiceCustomer();
        Show_Service.showAllVilla();
        boolean flag;
        String chooseVilla = null;
        do {
            flag = true;
            System.out.println("Choose villa you want booking");
            chooseVilla = scanner.nextLine();
            try {
                RegularExpression.indexVillaException(chooseVilla);
            }catch (IndexOutOfBoundsException e ){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(ReadFile.villaList.get(Integer.parseInt(chooseVilla) - 1));
    }

    public static void choiceRoom() {
        choiceCustomer();
        Show_Service.showAllRoom();
        boolean flag;
        String chooseRoom = null;
        do {
            flag = true;
            System.out.println("Choose room you want booking");
            chooseRoom = scanner.nextLine();
            try {
                RegularExpression.indexRoomException(chooseRoom);
            }catch (IndexOutOfBoundsException e ){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);
        ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(ReadFile.roomList.get(Integer.parseInt(chooseRoom) - 1));
    }

    public static void choiceHouse() {
        choiceCustomer();
        Show_Service.showAllHouse();

        boolean flag;
        String chooseHouse = null;
        do {
            flag = true;
            System.out.println("Choose House you want booking");
            chooseHouse = scanner.nextLine();
            try {
                RegularExpression.indexHouseException(chooseHouse);
            }catch (IndexOutOfBoundsException e ){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(ReadFile.houseList.get(Integer.parseInt(chooseHouse) - 1));
    }

}
