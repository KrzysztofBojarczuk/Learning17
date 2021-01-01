public class Month
{
    public static void main(String[] args) {

        String[] months = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lpiec",
        "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int index = 0; index < months.length; index++)

            System.out.println(months[index] + " ma " + days[index] + " dni.");
    }
}
