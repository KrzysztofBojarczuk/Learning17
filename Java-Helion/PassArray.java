import java.util.Scanner;

public class PassArray
{
    public static void main(String[] args) {

        final int ARRAY_SIZE = 4;
        int[] numbers = new int[ARRAY_SIZE];

        getValues(numbers);

        System.out.println("Oto podane " + "liczby:");

        showArray(numbers);
    }

    private static void getValues(int[] array)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj serię " + array.length + " liczba.");

        for (int index = 0; index < array.length; index++)
        {
            System.out.print("Podaj liczbę number " + (index + 1) + ": ");
            array[index] = keyboard.nextInt();
        }
    }

    public static void showArray(int[] array)
    {
        for (int index = 0; index < array.length; index++)
            System.out.print(array[index] + " ");
    }
}
