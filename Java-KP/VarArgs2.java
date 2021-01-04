public class VarArgs2
{
    static void vaTest(String msg, int ...v)
    {
        System.out.print(msg + v.length + " Zawartość: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        vaTest("Jeden paramentr typu vararg: ", 10);
        vaTest("Trzy paramentr typu vararg: ", 1, 2, 3);
        vaTest("Bral paramentr typu vararg: ");
    }
}
