public class OverloadCons
{
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("Objętość mybox1 wynosi " + vol);

        vol = mybox2.volume();
        System.out.println("Objętość mybox2 wynosi " + vol);

        vol = mycube.volume();
        System.out.println("Objętość mycube wynosi " + vol);
    }
}
