import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printHead();
        int operation = scanner.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Введите первое число: ");
                double first = scanner.nextDouble();
                System.out.println("Введите второе число: ");
                float second = scanner.nextFloat();
                System.out.println("Результат: ");
                if(Math.abs(first - second) >= 0.1) {
                    System.out.println("Числа не равны");
                } else {
                    System.out.println("Числа равны");
                    }
                    break;
            case 2:
                System.out.println("Введите число для округления: ");
                double third = scanner.nextDouble();
                double result = Math.round(third);
                System.out.println("Результат: " + result);
                break;
            case 3:
                System.out.println("Введите число с дробной частью: ");
                double four = scanner.nextDouble();
                long five = (long) four;
                System.out.println("Результат: " + five);
                break;
            default: System.out.println("Нет такого пункта");
        }
    }
    public static void printHead() {
        System.out.println("Операции над double/float");
        System.out.println("1. Сравнить");
        System.out.println("2. Округлить");
        System.out.println("3. Отбросить дробную чать");
    }
}
