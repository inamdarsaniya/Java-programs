interface temporary {
    void display();
    static void imag() {
        System.out.println("static method inside interface is called");
    }
}
class world implements temporary {
    public void display() {
        System.out.println("display method is called");
    }
}


public class IFstatic {
    public static void main(String[] args) {
        world obj=new world();
        obj.display();
        temporary.imag();
    }
}
