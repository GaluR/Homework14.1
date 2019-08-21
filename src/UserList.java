import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> list = new ArrayList<>();

        System.out.println("Wprowadz liczbę: ");
        sumOfNumbers(list, scan);
        System.out.println("Największa wartość z wprowadzonych to: " + theBiggestOne(list));
        System.out.println("Najmniejsza wartość z wprowadzonych to: " + theLoweststOne(list));
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

    private static void sumOfNumbers(List<Double> list, Scanner scan) {
        double number = 0;
        double sum = 0;
        while (!(number < 0)) {         //wczytywanie wartości od użytkownika do listy i sumowanie ich
            number = scan.nextDouble();
            if (number >= 0) {
                list.add(number);
                sum += number;
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) { // wyświetlanie listy w odwrotnej do wprowaadzonej kolejnosci
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            if (!(i == list.size() - 1)) {                  //wyświetlanie wartosci i sumy
                System.out.printf(list.get(i) + " + ");
            } else {
                System.out.printf(list.get(i) + " = ");
                System.out.println(sum + "\n");
            }
        }
    }

}