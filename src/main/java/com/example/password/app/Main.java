package com.example.password.app;

import com.example.password.PasswordGenerator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordGenerator generator = new PasswordGenerator();

        while (true) {
            int length;
            while (true) {
                System.out.println("Введите длину генерируемого пароля (от 8 до 16 символов): ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Ошибка! Введите число.");
                    scanner.next();
                    continue;
                }
                length = scanner.nextInt();
                if (length < 8) System.out.println("Длина пароля слишком короткая.");
                else if (length > 16) System.out.println("Длина пароля слишком длинная.");
                else break;
            }

            String password = generator.generatePassword(length);
            System.out.println("Ваш новый пароль: " + password);

            System.out.println("1 — новый пароль, 2 — закрыть программу");
            int choice;
            while (true) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Введите 1 или 2.");
                    scanner.next();
                    continue;
                }
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) break;
            }
            if (choice == 2) break;
        }
        scanner.close();
    }
}
