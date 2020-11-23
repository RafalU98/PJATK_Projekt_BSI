//          Authors: Rafał Ubermanowicz
//          Date: 21.11.2020
//          Project for BSI Classes in PJATK-University
//          Source:  Problem 2 in ch17pp.doc

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcessorFRoverTime {

    Scanner scanner = new Scanner (System.in);
    int menu, processorTested;
    double failPerHour, failPerMonth;

    public void main() {

        System.out.println("Expected Failures of processors per month with given failures per hour.\n");


        try {
            System.out.println("Enter the number of processors tested: (Enter a whole number) ");
            processorTested = scanner.nextInt();

            System.out.println("Enter the failures per hour: (Enter a decimal number) ");
            failPerHour = scanner.nextDouble();
        }  catch (InputMismatchException exception) {
                System.out.println("Wrong Data Type, Enter a whole number next time");
                Main.TaskOptions();
        }

        System.out.println("FR(N) for the " + processorTested + " units: " + failPerMonth + " failures per month.");
        System.out.println("The average time before a chip bring down the system is: " + 1/failPerMonth*30 + " days.");

        System.out.println("Do You want to go back to the Main Menu (Enter 1)");
        menu = scanner.nextInt();

        if (menu == 1) Main.TaskOptions();
    }
}
