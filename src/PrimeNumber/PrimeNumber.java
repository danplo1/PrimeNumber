package PrimeNumber;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 23.06.2017.
 */
public class PrimeNumber {
    public static void main(String[] args) {

        PrimeNumber.CheckPrimeNumber();


    }

    public static void CheckPrimeNumber() {

        Scanner primeNumber = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        int a = primeNumber.nextInt();

        boolean prime = true;
        for (int i = 2; i * i <= a; i++)
            if (a % i == 0)

                prime = false;
        if (prime) {
            System.out.println("To jest liczba pierwsza. ");
        } else {
            System.out.println("To nie jest liczba pierwsza. ");
        }
    }
}







