package Ls2_Loop.thuchanh;

import java.util.Scanner;

public class displayShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("2. Draw the square");
                    for (int i=0;i<5;i++){
                        System.out.println("* * * * *");
                    }
                    break;
                case 3:
                    System.out.println("3. Draw the rectangle");
                    for (int i=0;i<3;i++){
                        System.out.println("* * * * * *");
                    }
                    break;
            }

        }while (choice>3);
    }
}
