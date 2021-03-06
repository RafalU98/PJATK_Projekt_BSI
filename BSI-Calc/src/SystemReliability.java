/*
    Author: Rafał Ubermanowicz, Marcin Rozkwitalski
    Source:  Problem 3 in ch17pp.doc

    Explained in README:
    https://github.com/RafalU98/PJATK_Projekt_BSI/blob/main/README.md#3-count-the-reliability-of-a-system-by-chaining-different-reliability-blocks
 */

import java.util.Scanner;

public class SystemReliability {

    Scanner scanner = new Scanner(System.in);
    int choose, choose1, menu;
    double decimal,sum, lastAdded;

    public void main() {
        System.out.println("3. Finding the reliability of a system by chaining different reliability blocks");

        System.out.println("Please enter the reliability of the First system in decimal e.g. 0.95 or 0.91");
        decimal = scanner.nextDouble();
        if (decimal > 0.99) {
            decimal = decimal / 100;
        }
        sum = decimal;
        lastAdded = decimal;

        boolean next = true;

        while (next) {
            System.out.println("Please enter the reliability of the Next System");
            decimal = scanner.nextDouble();
            if (decimal > 0.99) {
                decimal = decimal / 100;
            }
            System.out.println("Choose if you want to add the system vertically or horizontally\n Choose 1 for: Horizontally\n Choose 2 for: Vertically");
            choose = scanner.nextInt();
            if (choose == 1) {
                sum *= decimal;
                lastAdded = decimal;
            } else if (choose == 2) {
                sum += decimal * (1 - lastAdded);
                lastAdded = decimal;
            } else {
                System.out.println("You can only choose 1 or 2");
            }
            System.out.println("Do You want to enter another system? (Enter 1) if no (Enter 0) ");
            choose1 = scanner.nextInt();
            if (choose1 == 0){
                next = false;
            }
        }


        System.out.println("The Reliability of the whole system you have build is: " + sum + ", which is: " + sum * 100 + "%.");

        System.out.println("Do You want to go back to the Main Menu (Enter 1)");
        menu = scanner.nextInt();

       if (menu == 1) Main.TaskOptions();
    }
}
