/*
    Finding the reliability of a system by chaining different reliability blocks

    example:

    [0,92]              [0,95]
      |                   |
      |                   |
    [0,95]----[0,98]----[0,90]


     0,95 + 0,92 * (1 - 0,95) * 0,98 * 0,90 + 0,95 * (1 - 0,90) == 0,966 -> 96,6%

*/


//Dodawanie horizontalli    robimy razy

//dodawanie diagonalli    robimy +  i gorne * 1- dolne


import java.util.Scanner;

public class SystemReliability {
    public void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("3. Finding the reliability of a system by chaining different reliability blocks");
        double decimal = 0;
        System.out.println("Please enter the reliability of the First system in decimal e.g. 0.95 or 0.91");
        decimal = s.nextDouble();

        System.out.println("Please enter the reliability of the Next System");
        decimal = s.nextDouble();

        int choose = 0;
        System.out.println("Choose if you want to add the system diagonally or horizontally/n" +
                "1. Horizontally" +
                "2. Diagonally");
        choose = s.nextInt();

        if (choose == 1)

        //metoda hori

        //metoda diag

        System.out.println();
    }
}
