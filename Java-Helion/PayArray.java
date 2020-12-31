import java.util.Scanner;

public class PayArray
{
    public static void main(String[] args) {

        final int EMPLYEES = 5;
        double payRate;
        double grossPay;

        int[] hours = new int[EMPLYEES];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj liczbę godzin przepracowanych przez " + EMPLYEES +
                " pracowników mających " + "te samą stawkę godzinową.");

        for (int index = 0; index < EMPLYEES; index++)
        {
            System.out.print("Pracownik numer " + (index + 1) + ": ");
            hours[index] = keyboard.nextInt();
        }
        System.out.println("Podaj stawkę godzinową wszystkich pracowników: ");
        payRate = keyboard.nextDouble();

        System.out.println("Pensje brutto wszystkich pracowników:");
        for (int index = 0; index < EMPLYEES; index++)
        {
            grossPay = hours[index] * payRate;
            System.out.println("Pracownik numer " + (index + 1) + ": " + grossPay + " złotych.");
        }

    }
}
