package myProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int True = 0;
        while(True == 0) {
            System.out.println("Введите номер команды:");
            System.out.println("1: Переворот массива;");
            System.out.println("2: Нахождение среднего значения массива, максимума и минимума;");
            System.out.println("0: Выход из программы.");
            int cmd = scanner.nextInt();
            switch (cmd){
                case 1:
                    reversMass();
                    break;
                case 2:
                    srZnachMaxMin();
                    break;
                case 0:
                    System.out.println("Работа программы завершена");
                    True = 1;
                    break;
                default:
                    System.out.println("Такой команды не существует!!!");
                    break;
            }
        }
    }

    private static void reversMass() {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Исходный массив");
        for(int i = 0; i < 5; i++){
            System.out.print(a[i] + "\t");
        }
        for(int i = 0; i < 2; i++){
            int buffer = a[i];
            a[i] = a[4 - i];
            a[4 - i] = buffer;
        }
        System.out.println("Массив перевернут!");
        for(int i = 0; i < 5; i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println("Работа модуля завершена!");
        System.out.println("________________________");
    }

    private static void srZnachMaxMin(){
        System.out.println("Модуль в разработке!");
    }
}
