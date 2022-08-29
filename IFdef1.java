
interface alpha1 {
    int getnum() ;
    default void display() {
        System.out.println("the default method in alpha interface");
    }
}
interface beta1 extends alpha1{
    int number() ;
    default void display() {
        System.out.println("the default method in beta is displayed");
    }
}
class greek1 implements  beta1 {
    public int getnum() {
        return 100;
    }
    public int number () {
        return 50;
    }
    
}

public class IFdef1 {
    public static void main(String[] args) {
        greek1 obj=new greek1(); 
        System.out.println(obj.getnum());
        System.out.println(obj.number());
        obj.display();
    } 
}
