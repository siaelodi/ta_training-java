package com.epam.training.student_alexandra_nemtseva.fundamentals;

import java.util.Scanner;

/**
 * Приветствовать любого пользователя при вводе его имени через командную строку.
 */
public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Please, input your name:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
