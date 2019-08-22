import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> list = new ArrayList<>();

        System.out.println("Wprowadz liczbę: ");
        load(scan, list);
        showInversely(list);
        sumOfNumbers(list);
        System.out.println(theBiggestOne(list));
        System.out.println(theLoweststOne(list));
    }

    private static void load(Scanner scan, List<Double> list) {
        double number = 0;
        while (number >= 0) {
            number = scan.nextDouble();
            if (number >= 0) {
                list.add(number);
            }
        }
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
                lower = list.get(i);
            }
        }
        return lower;
    }

    private static void showInversely(List<Double> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(" ");
    }

    private static void sumOfNumbers(List<Double> list) {
        double sum =0;
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.printf(list.get(i) + " + ");
            } else {
                for (int j = 0; j <list.size() ; j++) {
                    sum += list.get(j);
                }
                System.out.printf(list.get(i) + " = " + sum);
            }
        }
        System.out.println(" ");
    }
}