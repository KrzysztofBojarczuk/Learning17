import java.util.Scanner;

public class DisplayTestScores
{
    public static void main(String[] args) {
        int numTests;
        int[] tests;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ile testów przeprowadzono? ");
        numTests = keyboard.nextInt();

        tests = new int[numTests];

        for (int index = 0; index < tests.length; index++)
        {
            System.out.print("Podaj wynik testu numer " + (index + 1) + ": ");
            tests[index] = keyboard.nextInt();
        }
        System.out.println();
        System.out.println("Oto wprowadzone wyniki testów:");
        for (int index = 0; index < tests.length; index++)
            System.out.print(tests[index] + " ");
    }
}
