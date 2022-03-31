package com.epam.training.student_alexandra_nemtseva.fundamentals;

import java.util.Scanner;

/**
 * Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
 * Осуществить проверку корректности ввода чисел.
 */
public class DisplayMonth {
    public static void main(String[] args) {
        System.out.println("Type the number from 1 to 12.");
        Scanner scanner = new Scanner(System.in);
        int indexMonth = 0;

        if (scanner.hasNextInt()){
            indexMonth = scanner.nextInt();
        }else{
            System.out.println("Wrong number!");
        }
        switch (indexMonth){
            case 1:
                System.out.println("January"); break;
            case 2:
                System.out.println("February");break;
            case 3:
                System.out.println("March");break;
            case 4:
                System.out.println("April"); break;
            case 5:
                System.out.println("May");  break;
            case 6:
                System.out.println("June"); break;
            case 7:
                System.out.println("July"); break;
            case 8:
                System.out.println("August"); break;
            case 9:
                System.out.println("September"); break;
            case 10:
                System.out.println("October"); break;
            case 11:
                System.out.println("November"); break;
            case 12:
                System.out.println("December");
            default:
                System.out.println("A month cannot be determined.");
        }
    }
}
