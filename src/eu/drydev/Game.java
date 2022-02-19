package eu.drydev;

import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

//  Generiere Zahl zwischen 0 und 50
    static int rightNumber = ThreadLocalRandom.current().nextInt(0, 50 + 1);

//  Erstelle Versuche Variable
    static int trys = 1;

    public static void main(String[] args) {
        //openUI();
       nextRound();
    }


//  Rate Funktion
    public static void guess(int guessnumber){
        if(guessnumber == rightNumber) {
            System.out.println("Richtig geraten, mit " + trys + " Versuchen");
        } else {
            trys += 1; // Füge +1 Versuch hinzu
            System.out.println("Leider falsch :(");


            if(guessnumber < rightNumber) {
                System.out.println("Deine Zahl zu klein");
            } else {
                System.out.println("Deine Zahl zu groß");
            }
            nextRound();
        }
    }

    public static void nextRound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deine Zahl: ");
        int guessnumber = scanner.nextInt(); // Speicher eingabe zur guessnumber
        guess(guessnumber);
    }

    public static void openUI() {
        JFrame frame = new JFrame("Guess the Number");
        frame.setSize(350, 350);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);

        JLabel text = new JLabel("Zahl zwischen 0-50!");
        text.setBounds(50, 50, 200, 300);

        JTextField textField = new JTextField();
        textField.setBounds(50, 150, 200, 30);

        frame.add(textField);
        frame.add(text);
        frame.setVisible(true);
    }
}
