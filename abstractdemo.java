abstract class Aa {
    abstract void call();
    void callme() {
        System.out.println("a concrete method is called inside the abstract class");
    }
}
class Bb extends Aa {
    void call() {
        System.out.println("call inside class b");
    }
}

public class abstractdemo {
    public static void main(String[] args) {
        Bb obj=new Bb();
        obj.call();
        obj.callme();
    }
}
