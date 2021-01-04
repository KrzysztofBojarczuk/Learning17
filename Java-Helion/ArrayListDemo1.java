import java.util.ArrayList;

public class ArrayListDemo1
{
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Jacek");
        nameList.add("Celina");
        nameList.add("Borys");

        System.out.println("W tym obiekcjie typu ArrayList zapisano " + nameList.size() + " elementy.");

        for (int index =0; index < nameList.size(); index++)
            System.out.println(nameList.get(index));
    }
}
