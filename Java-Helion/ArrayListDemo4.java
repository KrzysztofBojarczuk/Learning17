import java.util.ArrayList;

public class ArrayListDemo4
{
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Jacek");
        nameList.add("Celina");
        nameList.add("Borys");

        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Indeks: " + index + " Imię: " + nameList.get(index));
        }

        nameList.add(1, "Maria");

        System.out.println("Dodano imię Maria o indeksie 1. " + "Teraz dostępne są następujące elementy.");

        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Indeks: " + index + " Imię: " + nameList.get(index));
        }
    }
}
