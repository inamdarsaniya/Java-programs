interface one {
    void display1();
}
interface two extends one{
    void display2 ();
}
class ABC implements two {
   public void display1() {
        System.out.println("inside display 1");
    }
    public void display2 (){
        System.out.println("inside display 2");
    }

}

public class IFextend{
    public static void main(String[] args) {
        ABC obj=new ABC();
        obj.display1();
        obj.display2();
    }
}
