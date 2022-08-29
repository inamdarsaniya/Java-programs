class A {
A() {
    System.out.println("calling class a constructor");
}
}
class B extends A {
    B() {
        super();
        System.out.println("calling class b constructor ");
    }
}
class C extends B {
    C() {
        super();
        System.out.println("calling class C constructor");
    }
}

public class callconst {
    public static void main(String[] args) {
        C obj=new C();
    }
}
