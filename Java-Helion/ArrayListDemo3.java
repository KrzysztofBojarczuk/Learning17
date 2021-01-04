import java.util.ArrayList;

public class ArrayListDemo3
{
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Jacek");
        nameList.add("Celina");
        nameList.add("Borys");

        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Indels: " + index + " Imię: " + nameList.get(index));
        }

        nameList.remove(1);

        System.out.println("Usunięto element o indeksie 1. " + "Teraz dostępne są następujące elelemnty.");

        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Indeks: " + index + " Imię: " + nameList.get(index));
        }

    }
}
