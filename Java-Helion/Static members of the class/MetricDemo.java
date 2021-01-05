import javax.swing.JOptionPane;

public class MetricDemo
{
    public static void main(String[] args)
    {
        String input;
        double miles;
        double kilos;

        input = JOptionPane.showInputDialog("Podaj " + "odległość w milach:");
        miles = Double.parseDouble(input);

        kilos = Metric.mileToKilometers(miles);
        JOptionPane.showMessageDialog(null, String.format("%,.2f w milach to %,.2f w kilometrach.",
                miles, kilos));

        input = JOptionPane.showInputDialog("Podaj " + "odległośc w kilometrach: ");
        kilos = Double.parseDouble(input);

        miles = Metric.kilometersToMiles(kilos);
        JOptionPane.showMessageDialog(null, String.format("%,.2f w kilometrach to %,.2f w milach.",
                kilos, miles));

        System.exit(0);
    }

}
