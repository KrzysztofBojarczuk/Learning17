public class PassObject2
{
    public static void main(String[] args) {

        Rectangle box = new Rectangle(12.0, 5.0);

        System.out.println("Zawartość obiektu box:");
        System.out.println("Długość: " + box.getLength() + " Szerokość: " + box.getWidth());

        changeRectangle(box);

        System.out.println("\nObecna zawartość obiektu " + "box to:");
        System.out.println("Długość: " + box.getLength() + " Szerokość: " + box.getWidth());
    }

    public static void changeRectangle(Rectangle r)
    {
        r.setLength(0.0);
        r.setWidth(0.0);
    }
}
