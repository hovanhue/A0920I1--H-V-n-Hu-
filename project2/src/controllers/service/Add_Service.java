package controllers.service;

import commons.FileUntil;
import controllers.fileUtill.ReadFile;
import controllers.regular_exception.RegularExpression;
import models.House;
import models.Room;
import models.Villa;
import Exception.*;
import static controllers.menu_main.MainConTroller.displayMainMenu;
import static controllers.menu_main.MainConTroller.scanner;
import static controllers.regular_exception.RegularExpression.validateNameService;

public class Add_Service {
    private static String nameServices;
    private static String area;
    private static String cost;
    private static String amountOfPeopleMax;
    private static String rentType;
    static boolean flag;

    public static void addNewServices() {
        String choose;
        do {
            System.out.println("1. Add new villa \n"
                    + "2. Add new house \n"
                    + "3. Add new room \n"
                    + "4. Back to menu \n"
                    + "5. Exit \n");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addNewVilla();
                    addNewServices();
                    break;
                case "2":
                    addNewHouse();
                    addNewServices();
                    break;
                case "3":
                    addNewRoom();
                    addNewServices();
                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("please choose 1 to 5");
                    addNewServices();
                    break;
            }
        } while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) < 6);

    }
    public static void generalInformationServices() {

        do {
            flag = true;
            try {
                System.out.println("Enter the name services: ");
                nameServices = scanner.nextLine();
                validateNameService(nameServices);
            } catch (NameException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;
            try {
                System.out.println("Enter the area: ");
                area = scanner.nextLine();
                RegularExpression.validateAreaService(area);
            } catch (AreaServiceException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;
            try {
                System.out.println("Enter the cost: ");
                cost = scanner.nextLine();
                RegularExpression.validateCostService(cost);
            } catch (CostServicesException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;

            try {
                System.out.println("Enter the mount of people: ");
                amountOfPeopleMax = scanner.nextLine();
                RegularExpression.validateAmountPeopleService(amountOfPeopleMax);
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;
            try {
                System.out.println("Enter the rent type: ");
                rentType = scanner.nextLine();
                validateNameService(rentType);
            } catch (NameException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);
    }

    public static void addNewRoom() {
        ReadFile.readFileRoom();
        String idRoom;
        String accompaniedServiceFree;

        do {
            flag = true;
            System.out.println("Enter the id room: ");
            idRoom = scanner.nextLine();
            try {
                RegularExpression.validateIdRoom(idRoom);
            } catch (IdCardException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
            for(Room room : ReadFile.roomList){
                if(room.getId().equals(idRoom)){
                    System.out.println("ID have exists!!");
                    flag = false;
                }
            }

        }while (!flag);

        generalInformationServices();

        System.out.println("Enter the accompanied Service Free: ");
        accompaniedServiceFree = scanner.nextLine();

        Room room = new Room(idRoom, nameServices, Double.parseDouble(area), Double.parseDouble(cost),
                Integer.parseInt(amountOfPeopleMax), rentType, accompaniedServiceFree);
        String line = room.addFileCsv();
        FileUntil.writeInFile(ReadFile.PATH_FILE_ROOM, line);
        System.out.println("Đã thêm thành công!!");

    }

    public static void addNewHouse() {
        ReadFile.readFileHouse();

        String idHouse;
        String standardRoom;
        String comfortDescription;
        String numberofFloors;

        do {
            flag = true;
            System.out.println("Enter the id house");
            idHouse = scanner.nextLine();
            try {
                RegularExpression.validateIdHouse(idHouse);
            } catch (IdCardException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
            for(House house : ReadFile.houseList){
                if(house.getId().equals(idHouse)){
                    System.out.println("ID have exists");
                    flag = false;
                }
            }

        }while (!flag);

        generalInformationServices();

        do{
            flag = true;
            System.out.println("Enter the standard room");
            standardRoom = scanner.nextLine();
            try {
                validateNameService(standardRoom);
            } catch (NameException e) {
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);

        System.out.println("Enter the comfort Description");
        comfortDescription = scanner.nextLine();

        do{
            flag = true;
            System.out.println("Enter number Of Floors");
            numberofFloors = scanner.nextLine();
            try {
                RegularExpression.validateNumberOfFloorService(numberofFloors);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);

        House house = new House(idHouse, nameServices, Double.parseDouble(area), Double.parseDouble(cost),
                Integer.parseInt(amountOfPeopleMax), rentType, standardRoom, comfortDescription,
                Integer.parseInt(numberofFloors));
        String line = house.addFileCsv();
        FileUntil.writeInFile(ReadFile.PATH_FILE_HOUSE, line);
        System.out.println("Đã thêm thành công!!");
    }

    public static void addNewVilla() {

        ReadFile.readFileVilla();

        String idVilla = null;
        String standardRoom;
        String comfortableDecription;
        String poolArea;
        String numberOfFloors;
        do{
            flag = true;
            try {
                System.out.println("Enter the id villa");
                idVilla = scanner.nextLine();
                RegularExpression.validateIdVilla(idVilla);

            }catch (IdCardException e){
                System.out.println(e.getMessage());
                flag = false;
            }

            for (Villa villa : ReadFile.villaList){
                if (villa.getId().equals(idVilla)){
                    System.out.println("ID have exists");
                    flag = false;
                }
            }

        }while (!flag);

        generalInformationServices();

        do{
            flag = true;
            System.out.println("Enter the standard room");
            standardRoom = scanner.nextLine();
            try {
                validateNameService(standardRoom);
            } catch (NameException e) {
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);


        System.out.println("Enter comfortable Decription");
        comfortableDecription = scanner.nextLine();

        do{
            flag = true;
            System.out.println("Enter the pool Area");
            poolArea = scanner.nextLine();
            try {
                RegularExpression.validateAreaService(poolArea);
            } catch (AreaServiceException e) {
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);

        do{
            flag = true;
            System.out.println("Enter number Of Floors");
            numberOfFloors = scanner.nextLine();
            try {
                RegularExpression.validateNumberOfFloorService(numberOfFloors);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);


        Villa villa = new Villa(idVilla, nameServices, Double.parseDouble(area), Double.parseDouble(cost),
                Integer.parseInt(amountOfPeopleMax), rentType, standardRoom
                ,comfortableDecription, Double.parseDouble(poolArea), Integer.parseInt(numberOfFloors));

        String line = villa.addFileCsv();
        FileUntil.writeInFile(ReadFile.PATH_FILE_VILLA, line);

        System.out.println("Đã thêm thành công!!");

    }
}

