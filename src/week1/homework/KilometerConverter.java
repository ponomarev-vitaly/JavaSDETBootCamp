package week1.homework;
import java.util.Scanner;
/*
7) Type a program which converts the mile to kilometer. Mile value will be
entered by user. (Use double)
Hint 1: km = mile x 1.6
Hint 2: To get double, use nextDouble()
 */
public class KilometerConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of miles you want to convert: ");
        double numberOfMiles = scan.nextDouble();
        double numberOfKilometeres = 1.6 * numberOfMiles;
        System.out.println("The number of the kilometeres is: " + numberOfKilometeres);

    }
}
