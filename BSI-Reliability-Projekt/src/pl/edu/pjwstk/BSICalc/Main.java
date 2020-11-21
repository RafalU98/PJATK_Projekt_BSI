
//          Authors: Marcin Rozkwitalski  & Rafał Ubermanowicz
//          Date: 21.11.2020
//          Project for BSI Classes in PJATK-University

package pl.edu.pjwstk.BSICalc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the BSI-Project from s19543 & s19826\n");
        Main.TaskOptions();
    }

    public static void TaskOptions() {
        ProcessorFR ProcessorFR = new ProcessorFR();
        ProcessorFRoverTime  ProcessorFRoverTime = new ProcessorFRoverTime();
        SystemReliability SystemReliability = new SystemReliability();
        FindingTestLife FindingTestLife = new FindingTestLife();
        FindingTimeOfTestingSamples FindingTimeOfTestingSamples = new FindingTimeOfTestingSamples();

        System.out.println("1. California Instruments, Find FR(%) and FR(N) of produced chips (FR = Fail Rate)");
        System.out.println("2. Expected Failures per month with the same chips as in 1.");
        System.out.println("3. Finding the reliability of a system by chaining different reliability blocks");
        System.out.println("4. Finding Test Life with given miles of life , reliability and confidence");
        System.out.println("5. Finding out how long you need to test x samples to find out the Goal Life of them\n");

        System.out.println("Choose now the Task you want to see\n");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("You chose Task " + choice + "\n");

        switch (choice) {
            case 1:
                ProcessorFR.main();
                break;
            case 2:
                ProcessorFRoverTime.main();
                break;
            case 3:
                SystemReliability.main();
                break;
            case 4:
                FindingTestLife.main();
                break;
            case 5:
                FindingTimeOfTestingSamples.main();
                break;
            default:
                System.out.println("This Task does not exist\n");
                System.out.println("Please chose a new Task:");
                Main.TaskOptions();
        }
    }
}


