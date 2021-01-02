import java.util.Scanner;

public class CorpSales
{
    public static void main(String[] args) {
        final int DIVS = 3;
        final int QTRS = 4;
        double totalSales = 0.0;

        double[][] sales = new double[DIVS][QTRS];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ten program oblicza łączną wartośc " + "sprzedaż we wszystkich ");
        System.out.println("jednostkach firmy. " + "Wprowadź następujące dane sprzedażowe:");

        for (int div = 0; div < DIVS; div++)
        {
            for(int qtr = 0; qtr < QTRS; qtr++)
            {
                System.out.printf("Jednostka %d, kwartał %d: ", (div + 1), (qtr +1));
                sales[div][qtr] = keyboard.nextDouble();
            }
            System.out.println();
        }
        for (int div = 0; div < DIVS; div++)
        {
            for (int qtr = 0; qtr < QTRS; qtr++)
            {
                totalSales += sales[div][qtr];
            }
        }
        System.out.printf("Łączna wartość sprzedaży to: %,.2f złotego.\n", totalSales);
    }
}
