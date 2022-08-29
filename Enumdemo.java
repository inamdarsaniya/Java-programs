enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class Enumdemo {
    public static void main(String[] args) {
        Apple ap;
        ap=Apple.Jonathan;
        System.out.println("the value of ap is "+ap);
        ap=Apple.GoldenDel;
        if(ap==Apple.GoldenDel) {
            System.out.println("ap contains GoldenDel");
        }
        switch(ap) {
            case Jonathan:
            System.out.println("it is Jonathan");
            break;
            case GoldenDel:
            System.out.println("it is GoldenDel");
            break;
            case RedDel:
            System.out.println("it is RedDel");
            break;
            case Winesap:
            System.out.println("it is winesap");
            break;
            case Cortland:
            System.out.println("it is cortland");
            break;
            default:
            System.out.println("invalid input");
        }

            Apple allapples[]=Apple.values();
            for(Apple a: allapples) {
                System.out.println(a);
            }
            ap=Apple.valueOf("Cortland");
            System.out.println("the value of ap is "+ap);
        
    }
}
