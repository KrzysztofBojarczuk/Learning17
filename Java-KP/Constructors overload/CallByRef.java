class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    void meth(Test o){
        o.a *= 1;
        o.b /= 2;
    }
}

public class CallByRef
{
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.println("ob.a i ob.b przed wywołaniem: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a i ob.b przed wywołaniem: " + ob.a + " " + ob.b);
    }
}
