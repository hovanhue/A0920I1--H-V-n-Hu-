package Ls2_Loop.thuchanh;

import java.util.Scanner;

public class isPrime {

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(4));
    }
}
