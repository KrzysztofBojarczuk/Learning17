public class StaticDemo
{
    public static void main(String[] args) {

        int objectCount;

        Countable object1 = new Countable();
        Countable object2 = new Countable();
        Countable object3 = new Countable();

        objectCount = object1.getInstanceCount();
        System.out.println("Liczba utworzonych instancji kalsy to " + objectCount + ".");
    }
}
