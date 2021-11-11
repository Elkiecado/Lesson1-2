package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число!");
        int range = 1000;
        int number = (int)(Math.random() * range);
        System.out.println("Отгадайте число от 0 до " + range);
        while(true) {

            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали");
                break;
            } else if (input_number > number){
                System.out.println("Загаданное число меньше. Попробуйте еще раз!");
            } else {
                System.out.println("Загаданное число больше. Попробуйте еще раз!");
            }
        }
        scanner.close();
    }
}

//region task_2

//endregion
