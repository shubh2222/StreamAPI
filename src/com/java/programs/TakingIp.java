package com.java.programs;

import java.util.Scanner;

public class TakingIp {
    static void main() {
        System.out.println("Taking Ip from user!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No 1: ");
        int a = scanner.nextInt();
        System.out.println("Enter No 2: ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum of these two nos is: "+sum);

        //hasNextInt()
        boolean b1 = scanner.hasNextInt();
        System.out.println(b1);

        String str = scanner.nextLine();
        System.out.println(str);

    }
}
