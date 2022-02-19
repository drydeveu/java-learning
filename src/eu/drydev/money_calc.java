package eu.drydev;

import java.util.Scanner;

public class money_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Euro?");
        double money = scanner.nextDouble();
        ConvertToDollar(money);
        ConvertToKMark(money);
    }

    public static void ConvertToDollar(double eur){
        System.out.println(eur + "€ in US Dollar sind: "+ eur * 1.20 + "$");
    }

    public static void ConvertToKMark(double eur){
        System.out.println(eur + "€ in Konvertible Mark sind: "+ eur * 1.95);
    }
}
