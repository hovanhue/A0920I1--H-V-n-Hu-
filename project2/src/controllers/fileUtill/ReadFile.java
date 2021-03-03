package controllers.fileUtill;

import commons.FileUntil;
import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static commons.FileUntil.readFromFile;

public class ReadFile {
    public static final String PATH_FILE_VILLA = "src/data/Villa.csv";
    public static final String PATH_FILE_ROOM = "src/data/Room.csv";
    public static final String PATH_FILE_HOUSE = "src/data/House.csv";
    public static final String PATH_FILE_CUSTOMER = "src/data/Customer.csv";
    public static final String PATH_FILE_BOOKING = "src/data/Booking.csv";
    public static final String PATH_FILE_EMPLOYEE = "src/data/Employee.csv";
    public static List<Villa> villaList;
    public static List<House> houseList;
    public static List<Room> roomList;
    public static List<Customer> customerList;
    public static List<Customer> bookingList;
    public static Map<String, Employee> employeeList;


    public static void readFileVilla() {
        villaList = new ArrayList<>();
        List<String> stringList = readFromFile(PATH_FILE_VILLA);
        String[] stringSplit;
        for (String string : stringList) {
            stringSplit = string.split(",");
            Villa villa = new Villa(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5], stringSplit[6], stringSplit[7],
                    Double.parseDouble(stringSplit[8]), Integer.parseInt(stringSplit[9]));
            villaList.add(villa);
        }

    }

    public static void readFileHouse() {
        houseList = new ArrayList<>();
        List<String> stringList = readFromFile(PATH_FILE_HOUSE);
        String[] stringSplit;
        for (String string : stringList) {
            stringSplit = string.split(",");
            House house = new House(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5], stringSplit[6], stringSplit[7], Integer.parseInt(stringSplit[8]));
            houseList.add(house);
        }
    }

    public static void readFileRoom() {
        roomList = new ArrayList<>();
        List<String> stringList = readFromFile(PATH_FILE_ROOM);
        String[] stringSplit;
        for (String string : stringList) {
            stringSplit = string.split(",");
            Room room = new Room(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]), stringSplit[5], stringSplit[6]);
            roomList.add(room);
        }
    }

    public static void readFileBooking() {
        readFileVilla();
        readFileHouse();
        readFileRoom();
        bookingList = new ArrayList<>();
        List<String> stringList = readFromFile(PATH_FILE_BOOKING);
        Services services = null;
        for (String string : stringList) {
            String[] stringSplit = string.split(",");
            for (Villa villa : villaList) {
                if (villa.getId().equals(stringSplit[8])) ;
                services = villa;
            }
            for (Room room : roomList) {
                if (room.getId().equals(stringSplit[8])) ;
                services = room;
            }
            for (House house : houseList) {
                if (house.getId().equals(stringSplit[8])) ;
                services = house;
            }
            Customer customer = new Customer(stringSplit[0], stringSplit[1], stringSplit[2],
                    stringSplit[3], stringSplit[4], stringSplit[5], stringSplit[6], stringSplit[7], services);
            bookingList.add(customer);
        }
    }


    public static void readFileCustomer() {
        customerList = new ArrayList<>();
        List<String> stringList = readFromFile(PATH_FILE_CUSTOMER);
        for (String string : stringList) {
            String[] stringSplit = string.split(",");
            Customer customer = new Customer(stringSplit[0], stringSplit[1], stringSplit[2],
                    stringSplit[3], stringSplit[4], stringSplit[5], stringSplit[6], stringSplit[7]);
            customerList.add(customer);
        }
    }

    public static void readfileEmployee() {
        employeeList = new TreeMap<>();
        List<String> StringList = readFromFile(PATH_FILE_EMPLOYEE);
        for (String string : StringList) {
            String[] stringSplit = string.split(",");
            Employee employee = new Employee(stringSplit[0], stringSplit[1], stringSplit[2],
                    stringSplit[3], stringSplit[4], stringSplit[5], stringSplit[6], stringSplit[7]);
            employeeList.put(stringSplit[7], employee);
        }

    }
}
