import java.util.ArrayList;

public class ArrayListDemo2
{
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Jacek");
        nameList.add("Celina");
        nameList.add("Borys");

        System.out.println("W tym obiekcie typu ArrayList zapisano " + nameList.size() + " elementy.");

        for (String name : nameList)
            System.out.println(name);
    }
}
