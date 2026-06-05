package com.java.programs;

import java.util.Scanner;

public class PercentageCBSE {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st Sub Mark is: ");
        int sm1 = sc.nextInt();
        System.out.println("2nd Sub Mark is: ");
        int sm2 = sc.nextInt();
        System.out.println("3rd Sub Mark is: ");
        int sm3 = sc.nextInt();
        System.out.println("4th Sub Mark is: ");
        int sm4 = sc.nextInt();
        System.out.println("5th Sub Mark is: ");
        int sm5 = sc.nextInt();
        System.out.println("Percentage: ");
        int per = (sm1 + sm2 + sm3 + sm4 + sm5) * 100 / 500;
        System.out.println("Per is: "+per);
    }
}
