public class SearchArray
{
    public static void main(String[] args) {
        int[] tests = { 87, 75, 98, 100, 82};
        int results;

        results = sequentialSearch(tests, 100);

        if (results == -1)
        {
            System.out.println("W żadnym teście " + "nie uzyskałeś 100 punktów.");
        }
        else
        {
            System.out.println("Uzyskałeś 100 punktów " + "w teście numer " + (results + 1) + ".");
        }
    }

    public static int sequentialSearch(int[] array, int value)
    {
        int index;
        int element;
        boolean found;

        index = 0;

        element = -1;
        found = false;

        while (!found && index < array.length)
        {
            if (array[index] == value)
            {
                found = true;
                element = index;
            }
            index++;
        }
        return element;
    }
}
