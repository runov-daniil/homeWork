package myProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int True = 0;
        while(True == 0) {
            System.out.println("Введите номер задачи:");
            System.out.println("1: Переворот массива;");
            System.out.println("0: Выход из программы.");
            int cmd = scanner.nextInt();
            switch (cmd){
                case 1:
                    reversMass();
                    break;
                case 0:
                    True = 1;
                    break;
            }
        }
    }

    private static void reversMass() {
        System.out.println("Модуль в разработке!!!");
    }
}
