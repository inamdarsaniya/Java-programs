

interface alpha {
    int getnum() ;
    default void display() {
        System.out.println("the default method in alpha interface");
    }
}
interface beta {
    int number() ;
    default void display() {
        System.out.println("the default method in beta is displayed");
    }
}
class greek implements alpha,beta {
    public int getnum() {
        return 100;
    }
    public int number () {
        return 50;
    }
    public void display() {
        System.out.println("the overriden default method ");
    }
}

public class IFdef {
    public static void main(String[] args) {
        greek obj=new greek(); 
        System.out.println(obj.getnum());
        System.out.println(obj.number());
        obj.display();
    } 
}
