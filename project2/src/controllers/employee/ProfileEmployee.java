package controllers.employee;

import controllers.fileUtill.ReadFile;
import controllers.menu_main.MainConTroller;
import controllers.regular_exception.RegularExpression;
import models.Employee;

import java.util.Scanner;
import java.util.Stack;

public class ProfileEmployee {
    private static Stack<Employee> stack = new Stack<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void profileEmployee(){
        String choice;
        do {
            System.out.println("-----------------------------------");
            System.out.println("1. Add profile.");
            System.out.println("2. Show Profile.");
            System.out.println("3. Search profile.");
            System.out.println("4. Back.");
            System.out.println("5. Exit.");
            System.out.println("-----------------------------------");

            System.out.print("Enter choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    AddProfile();
                    profileEmployee();
                    break;
                case "2":
                    showProfile();
                    profileEmployee();
                    break;
                case "3":
                    searchProfile();
                    profileEmployee();
                    break;
                case "4":
                    MainConTroller.displayMainMenu();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter 1 - 4");
                    profileEmployee();
                    break;

            }
        } while (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < 5);
    }

    private static void searchProfile() {
        System.out.println("Enter Employee name");
        String employeeName = scanner.nextLine();

//        Iterator<Employee> iterator = stack.iterator();
//        while (iterator.hasNext()){
//            Employee employee = iterator.next();
//
//        }
        boolean flag = false;
        for (Employee employee : stack) {
            if(employee.getName().equals(employeeName)){
                System.out.println(employee.showInfor());
                flag = true;
            }
        }
        if(!flag){
            System.out.println("No result");
        }
    }

    private static void showProfile() {
        if(stack.isEmpty()){
            System.out.println("No profile");
        }

//        while (!stack.isEmpty()){
//            System.out.println(stack.pop().showInfor() + "\n");
//        }

        for (Employee employee : stack) {
            System.out.println(employee.showInfor());
        }
    }

    private static void AddProfile() {
        String choiceEmplyee = null;
        ShowEmployee.showInforEmployee();
        boolean flag;
        do {
            flag = true;
            System.out.println("Enter id Employee");
            choiceEmplyee = scanner.nextLine();
            try {
                RegularExpression.indexEmployeeException(choiceEmplyee);
            }catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                flag = false;
            }

            if(!ReadFile.employeeList.containsKey(choiceEmplyee)){
                System.out.println("id employee not found");
                flag = false;
            }
        }while (!flag);
        stack.push(ReadFile.employeeList.get(choiceEmplyee));
        System.out.println("SUCCES");
    }
}
