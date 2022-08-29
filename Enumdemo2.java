enum Apple {
    Jonathan(10),GoldenDel(9),RedDel(12),Winesap(15),Cortland(8);
    private int price;

    Apple(int p) {
        price=p;
    }

    int getprice(){
        return price;
    }
}


public class Enumdemo2 {
    public static void main(String[] args) {
        Apple ap;
        ap=Apple.Winesap;
        System.out.println(ap +" costs "+ap.getprice());
        System.out.println();
        for(Apple a:Apple.values()) {
            System.out.println("the cost of "+a+" is "+a.getprice());
        }
    }
}
