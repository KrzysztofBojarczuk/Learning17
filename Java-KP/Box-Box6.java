public class Box
{
    double witdh;
    double height;
    double depth;

    Box() {
        System.out.println("Konstrukcja obiektu Box");
        witdh = 10;
        height = 10;
        depth = 10;
    }
    double volume() {
        return witdh * height * depth;
    }
}
