public class DemoSuper
{
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volumne();
        System.out.println("Objętość mybox1: " + vol);
        System.out.println("Ciężar mybox1: " + mybox1.weight);
        System.out.println();

        vol = mybox2.volumne();
        System.out.println("Objętość mybox2: " + vol);
        System.out.println("Ciężar mybox2: " + mybox2.weight);
        System.out.println();

        vol = mybox3.volumne();
        System.out.println("Objętość mybox3: " + vol);
        System.out.println("Ciężar mybox3: " + mybox3.weight);
        System.out.println();

        vol = myclone.volumne();
        System.out.println("Objętość myclone: " + vol);
        System.out.println("Ciężar myclone: " + myclone.weight);
        System.out.println();
    }
}
