public class RefDemo
{
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volumne();
        System.out.println("Objętośc weightbox: " + vol);
        System.out.println("Ciężar weightbox: " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;

        vol = plainbox.volumne();
        System.out.println("Objętość plainbox: " + vol);
    }
}
