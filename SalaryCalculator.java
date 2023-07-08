package SalaryCalculation;

import java.util.Scanner;

class Salarycalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[7];
        int TotalHours = 0;
        for (int i = 0; i < 7; i++) {
            arr[i] = scanner.nextInt();
            TotalHours += arr[i];
        }
        if (TotalHours > 40) {
            TotalHours += (TotalHours - 40) * 25;
        }
        TotalHours *= 100;
        int temporary;
        for (int i = 1; i < 6; i++) {
            if (arr[i] > 8) {
                temporary = arr[i] - 8;
                TotalHours += (15 * temporary);
            }
        }
        if (arr[6] > 0) {
            TotalHours += 25 * arr[6];
        }
        if (arr[0] > 0) {
            TotalHours += 50 * arr[0];
        }
        System.out.println(TotalHours);
        scanner.close();
    }
}
