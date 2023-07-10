class Square{
    public int a=1;
    int b=2;
    protected int c=3;
    private int d=4;
}
class Cube extends Square{
    public void meth(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //System.out.println(d);
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
     Cube c = new Cube();
     c.meth();

    }
}
