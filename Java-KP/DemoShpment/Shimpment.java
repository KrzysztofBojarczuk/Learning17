public class Shimpment extends BoxWeight{
    double cost;

    Shimpment(Shimpment ob) {
        super(ob);
        cost = ob.cost;
    }
        Shimpment(double w, double h, double d, double m, double c)
        {
            super(w ,h, d, m);
            cost = c;
        }
        Shimpment(){
            super();
            cost = -1;
        }
        Shimpment(double len, double m, double c)
        {
            super(len, m);
            cost = c;
        }
}
