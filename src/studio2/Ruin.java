import java.util.Scanner;

public class Ruin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("The amount of money that you start with: ");
        int startAmount = scan.nextInt();
        System.out.print("Your win chance: ");
        double winChance = scan.nextDouble();
        System.out.print("The amount of money for a successful day: ");
        int winLimit = scan.nextInt();
        System.out.print("Number of simulations: ");
        int totalSimulations = scan.nextInt();

        int i = 1;
        String n1;
        for (i = 1; i <= totalSimulations; i++) {
            int currentAmount = startAmount;
            int j = 0;
            while (currentAmount < winLimit && currentAmount > 0) {        
                double rnd = Math.random();
                if (rnd <= winChance) {
                    currentAmount = currentAmount + 1;
                } else {
                    currentAmount = currentAmount - 1;
                }
                j++;
            }
            if (currentAmount >= winLimit) {
                n1 = "WIN";
            } else {
                n1 = "LOSE";
            }
            System.out.println("Simulation " + i + ": " + j + " " + n1);
        }

    }

}
