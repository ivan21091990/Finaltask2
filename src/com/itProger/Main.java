package com.itProger;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива и нажмите Enter: ");
        int x = scanner.nextInt();
        int[] array = new int[x];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " число массива: ");
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            int y = array[j];

            int i = (j - 1);
            for (; i >= 0; i--) {
                if (y < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = y;
        }
        System.out.println("Вывод массива по возрастанию: " + Arrays.toString(array));
    }
}
