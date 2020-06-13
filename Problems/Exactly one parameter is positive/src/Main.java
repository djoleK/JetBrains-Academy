import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean resultFirst = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean resultSecond = num1 <= 0 && num2 > 0 && num3 <= 0;
        boolean resultThird = num1 <= 0 && num2 <= 0 && num3 > 0;

        boolean result = resultFirst || resultSecond || resultThird;

        System.out.println(result);
    }
}