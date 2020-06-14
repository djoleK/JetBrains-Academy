import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int part;
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            part = scanner.nextInt();
            if (part == 1) {
                larger++;
            } else if (part == 0) {
                perfect++;
            } else if (part == -1) {
                smaller++;
            }
        }

        System.out.print(perfect + " " + larger + " " + smaller);
    }
}