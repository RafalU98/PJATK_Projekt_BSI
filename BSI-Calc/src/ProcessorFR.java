//          Authors: Rafał Ubermanowicz
//          Date: 21.11.2020
//          Project for BSI Classes in PJATK-University
//          Source:  Problem 1 in ch17pp.doc

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcessorFR {

    Scanner scanner = new Scanner(System.in);
    double tested, testTime, failed, downTime;
    int menu;

    public void main() {
        System.out.println("1. California Instruments, Find FR(%) and FR(N) of produced chips (FR = Fail Rate)\n");

        try {
            System.out.println("How many processors did you test: (Enter a whole number)");
            tested = scanner.nextInt();

            System.out.println("How long did you test each processor (in hours) : (Enter a whole number)");
            testTime = scanner.nextInt();

            System.out.println("Enter how many processors failed: (Enter a whole number)");
            failed = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Wrong Data Type, Enter a whole number next time");
            Main.TaskOptions();
        }

        for (int i = 1; i <= failed; i++){
            System.out.println("Enter working duration of " + i + " before it failed: ");
            downTime += testTime - (scanner.nextDouble());
        }

        NumberFormat formatter = new DecimalFormat("#.#######");

        System.out.println("The Failure Rate is: " + failed / tested + "%");
        System.out.println("The Failures per hour are: " + formatter.format(failed / ((testTime*tested) - downTime)));
        System.out.println("The average work time of a processor before failing is : " + (double) Math.round(1 / (failed / ((testTime*tested) - downTime))*100)/100);

        System.out.println("Do You want to go back to the Main Menu (Enter 1)");
        menu = scanner.nextInt();

        if (menu == 1) Main.TaskOptions();
    }
}