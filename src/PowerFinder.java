import java.util.Scanner;

public class PowerFinder {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.print("Введите степень: ");
        int power = scanner.nextInt();
        int result = findPower(number, power);
        System.out.println(number + " в степени " + power + " = " + result);
        scanner.close();
    }
       public static int findPower(int number, int power) {
              if (power < 0) {
            System.out.println("Степень должна быть неотрицательным числом.");
            return -1; // Возвращаем -1 в случае ошибки
        }

        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= number;
        }

        return result;
    }
}
