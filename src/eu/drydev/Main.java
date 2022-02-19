package eu.drydev;

public class Main {

    public static void main(String[] args) {

        greeting(21);
        bio("leandro", "schüler", "nordrhein-westfalen", 13);

        }


    public static void greeting(int hour) {

        if (hour < 12) {
            System.out.println("Guten Morgen!");
        } else {
            if (hour < 18) {
                System.out.println("Guten Tag!");
            } else {
                System.out.println("Guten Abend!");
            }
        }
    }

    public static void bio(String name, String job, String bundesland, int alter) {

        System.out.println("Ich bin " + name + " und bin " + job + ".");
        System.out.println("Ich komme aus " + bundesland + " und bin " + alter + " Jahre alt.");
    }
}
