import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int input;
        boolean ordered = false;
        while (scanner.hasNextInt()) {
            input = scanner.nextInt();
            if (input == 0){
                break;
            }
            lista.add(input);
        }
        if (lista.equals(sortAsc(lista)) || lista.equals(sortDesc(lista))){
           ordered = true;
        }

        System.out.println(ordered);

    }

    public static List<Integer> sortAsc(List<Integer> lista){
        List<Integer> sortirana = new ArrayList<>(lista);
        Collections.sort(sortirana);
        return  sortirana;

    }

    public static List<Integer> sortDesc(List<Integer> lista){
        List<Integer> sortirana = new ArrayList<>(lista);
        Collections.sort(sortirana, Collections.reverseOrder());
        return  sortirana;

    }
}
