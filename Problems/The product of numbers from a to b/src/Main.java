import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(product(a, b));
    }

    public static long product(int a, int b) {
        long product = 1;
        long i;
        for (i = a; i < b; i++) {
            product *= i;
        }

        return product;
    }
}