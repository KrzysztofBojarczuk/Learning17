import java.util.Scanner;

public class CalcAverage
{
    public static void main(String[] args) {
        int numScores;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ile wyników testów chcesz podać? ");
        numScores = keyboard.nextInt();

        double[] scores = new double[numScores];

        for (int index = 0; index < numScores; index++)
        {
            System.out.print("Podaj wynik numer " +
                    (index + 1) + ":");
            scores[index] = keyboard.nextDouble();
        }

        Grader myGrader = new Grader(scores);

        System.out.println("Średnia wartości ze zmodyfikowanej listy to " + myGrader.getAverage() + ".");

        System.out.println("Najniższy wynik testu to " + myGrader.getLowestScore() + ".");
    }
}
