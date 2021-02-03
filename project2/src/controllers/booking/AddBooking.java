package controllers.booking;

import static controllers.menu_main.MainConTroller.scanner;

public class AddBooking {
    public static void addNewBooking(){
        String choose;
        do {
            System.out.println("1. Booking Villa");
            System.out.println("2. Booking House");
            System.out.println("3. Booking Room");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit");
            choose = scanner.nextLine();
            switch (choose){
                case "1":


                case "2":


                case "3":


                case "4":


                case "5":


                default:
            }
        } while (Integer.parseInt(choose) < 0 || Integer.parseInt(choose) > 5);
    }
}
