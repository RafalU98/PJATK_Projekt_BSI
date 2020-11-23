/*
    Author: Marcin Rozkwitalski

    Exercise 4.3 based on Example 2.1
    How long should you test 10 samples of a component which is designed to have 1500
    hours at 80% confidence and 90% reliability? Assume b = 2 (weibull)

    Ans: 1,900 x 1.5 = 2,850 hours.
 */
import java.util.Scanner;

public class FindingTimeOfTestingSamples {
    private double findTimeOfTestingSamples(double time, double reliability, double confidence, double samples, double weibull){
        if( confidence > 0.99 ) { confidence = confidence / 100; }
        if( reliability > 0.99 ) { reliability = reliability / 100; }
        double a = ( 1 / (float) samples * ( Math.log10( 1 / ( 1 - confidence ))));
        double b = Math.log10( 1 / (1 - (1 - reliability)));
        double c = Math.pow( (a / b), (1 / weibull) );
        return time * c * 1.5;
    }

    public void main() {
        int menu;
        double time, reliability, confidence, samples, weibull, result;

        System.out.println("5. Finding out how long you need to test X samples to find out the Goal Life of them");
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("\nEnter time (hours): ");
            time = Double.parseDouble(input.nextLine());
            if(time < 0){
                throw new IllegalArgumentException("Value out ot range.");
            }
            System.out.println("\nEnter reliability: ");
            reliability = Double.parseDouble(input.nextLine());
            if(reliability > 100.0 || reliability < 0.01){
                throw new IllegalArgumentException("Value out ot range.");
            }
            System.out.println("\nEnter confidence: ");
            confidence = Double.parseDouble(input.nextLine());
            if(confidence > 100.0 || confidence < 0.01){
                throw new IllegalArgumentException("Value out ot range.");
            }
            System.out.println("\nEnter samples: ");
            samples = Double.parseDouble(input.nextLine());
            if(samples < 1.0){
                throw new IllegalArgumentException("Value out ot range.");
            }
            System.out.println("\nEnter weibull: ");
            weibull = Double.parseDouble(input.nextLine());
            if(weibull < 1.0){
                throw new IllegalArgumentException("Value out ot range.");
            }
            result = findTimeOfTestingSamples(time, reliability, confidence, samples, weibull);
            System.out.println("Test duration for all samples with no failures would be " + String.format("%.0f", result) + " hours long.");
            System.out.println("\nDo you want to go back to the Main Menu? (Enter 1)");
            menu = input.nextInt();
            if(menu == 1) Main.TaskOptions();
        } catch (NumberFormatException exception){
            System.out.println("Wrong data type, enter number.");
        }
    }
}
