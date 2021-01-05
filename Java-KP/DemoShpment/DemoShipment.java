public class DemoShipment
{
    public static void main(String[] args) {
        Shimpment shimpment1 =
                new Shimpment(10, 20, 15, 10, 3.41);
        Shimpment shimpment2 =
                new Shimpment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = shimpment1.volumne();
        System.out.println("Objętość shipment1 " + vol);
        System.out.println("Ciężar shipment1; " + shimpment1.weight);
        System.out.println("Koszt przesyłki w złotówkach: " + shimpment1.cost);
        System.out.println();

        vol = shimpment2.volumne();
        System.out.println("Objętość shipment2: " + vol);
        System.out.println("Ciężar shipment2:"  + shimpment2.weight);
        System.out.println("Koszt przesyłki w złotówkach: " + shimpment2.cost);
    }
}
