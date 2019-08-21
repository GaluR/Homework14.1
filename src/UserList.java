import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> list = new ArrayList<>();

        System.out.println("Wprowadz liczbę: ");
        double number = 0;
        double sum = 0;
        while (!(number < 0)) {
            number = scan.nextDouble();
            if (number >= 0) {
                list.add(number);
                sum += number;
            }
        }
        sumOfNumbers(list);
        System.out.println(sum);
        showInversely(list);
        System.out.println("\n" + theBiggestOne(list));
        System.out.println(theLoweststOne(list));
    }

    private static double theBiggestOne(List<Double> list) {
        double bigger = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > bigger) {
                bigger = list.get(i);
            }
        }
        return bigger;
    }

    private static double theLoweststOne(List<Double> list) {
        double lower = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < lower) {
                lower = list.get(i); // alternatywnie Collections.max(list) <- fajna funkcja;
            }
        }
        return lower;
    }

    private static void showInversely(List<Double> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static void sumOfNumbers(List<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(i == list.size() - 1)) {
                System.out.printf(list.get(i) + " + ");
            } else {
                System.out.printf(list.get(i) + " = ");
            }
        }
    }
}