package com.java.programs;

import java.util.Scanner;

public class TakingNameFromIp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name+" have a good day");

        //Q5
        System.out.println("Enter your no: ");
        System.out.println(sc.hasNextInt());
    }
}
