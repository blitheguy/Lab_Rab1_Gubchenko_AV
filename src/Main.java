import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();
        System.out.println("Введте второе число:");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int number3 = scanner.nextInt();
        System.out.println("Сумма чисел = " + (number1 + number2 + number3));
    }
}