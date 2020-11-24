/*
    Author: Rafał Ubermanowicz, Marcin Rozkwitalski
    Source:  Problem 3 in ch17pp.doc

    Explained in README:
    https://github.com/RafalU98/PJATK_Projekt_BSI/blob/main/README.md#3-count-the-reliability-of-a-system-by-chaining-different-reliability-blocks
 */

import java.util.Scanner;

public class SystemReliability {

    Scanner scanner = new Scanner(System.in);
    int choose, menu;
    double decimal,sum;

    public void main() {
        System.out.println("3. Finding the reliability of a system by chaining different reliability blocks");

        System.out.println("Please enter the reliability of the First system in decimal e.g. 0.95 or 0.91");
        decimal = scanner.nextDouble();
        sum = decimal;

        // todo for loop & try-catch

        System.out.println("Do You want to enter another system? (Enter 1) if no (Enter 0) ");

        System.out.println("Please enter the reliability of the Next System");
        decimal = scanner.nextDouble();

        System.out.println("Choose if you want to add the system vertically or horizontally\n Choose 1 for: Horizontally\n Choose 2 for: Diagonally");
        choose = scanner.nextInt();
        if (choose == 1){
            sum *= decimal;
        }
        else if (choose == 2){
            sum += decimal; //todo *(1 - last- added);
        }else{
            System.out.println("You can only choose 1 or 2");
        }

        // todo end of loop

        System.out.println("The Reliability of the whole system you have buid is: " + sum + ", which is: " + sum * 100 + "%.");

        System.out.println("Do You want to go back to the Main Menu (Enter 1)");
        menu = scanner.nextInt();

       if (menu == 1) Main.TaskOptions();
    }
}
