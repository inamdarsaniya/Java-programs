interface MYIF {
    int getnum();
    default void met (){
        System.out.println("default method declared inside interface");
    }
}
class MYclass implements MYIF {
    public int getnum() {
        return 100;
    }
    public void met() {
        System.out.println("the default method in interface is overridden");
    }
}


public class IFdefault {
    public static void main(String[] args) {
        MYclass obj=new MYclass();
        System.out.println("the normal interface method is called "+obj.getnum());
        obj.met();
    }
}
