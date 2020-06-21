import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            i = scanner.nextInt();
            if (i == 0){
                break;
            }
            if (i % 2 == 0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }while (true);
    }
}