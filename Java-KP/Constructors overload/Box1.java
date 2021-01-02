class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}


public class OverloadCons
{
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Objętość mybox1 wynosi " + vol);

        vol = mybox2.volume();
        System.out.println("Objętość mybox2 wynosi " + vol);

        vol = mycube.volume();
        System.out.println("Objętość mycube wynosi " + vol);

        vol = myclone.volume();
        System.out.println("Objętość clone wynosi " + vol);
    }
}
