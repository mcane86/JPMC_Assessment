package com.michaelcane;

import java.util.Scanner;

public class UserInputHandler {

    public static Scanner input = new Scanner(System.in);

    public static void promptUser(String msg) {
        System.out.println(msg);
    }

    public static int promptUserForInt(String msg) {
        System.out.println(msg);
        return input.nextInt();
    }
}
