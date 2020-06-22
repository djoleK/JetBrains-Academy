import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int bridgeHeight;
        for (int i = 0; i < numberOfBridges; i++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight > busHeight && i == numberOfBridges - 1) {
                System.out.println("Will not crash");
            } else if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }

        }
    }
}
