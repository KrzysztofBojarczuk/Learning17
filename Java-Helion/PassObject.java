public class PassObject
{
    public static void main(String[] args) {

        Rectangle box = new Rectangle(12.0, 5.0);

        displayRectangle(box);
    }

    public static void displayRectangle(Rectangle r)
    {
        System.out.println("Długość: " + r.getLength() + " Szerokość: " + r.getWidth());
    }
}
