enum Apple {
    Jonathan,GoldenDel,RedDel,Winesap,Cortland
}

public class Enumdemo3 {
    public static void main(String[] args) {
        Apple ap,ap2,ap3;

        System.out.println("the ordinal values for all the apples are :");
        for (Apple a:Apple.values()) {
            System.out.println(a+" is "+a.ordinal());
        }
        System.out.println();

        ap=Apple.RedDel;
        ap2=Apple.GoldenDel;
        ap3=Apple.RedDel;

        if(ap.compareTo(ap2)<0) System.out.println("ap comes before ap2");
        if(ap.compareTo(ap2)>0) System.out.println("ap comes after ap2");
        if(ap.compareTo(ap3)==0) System.out.println("ordinal value of ap is equal to ap3");
        if(ap.equals(ap2)) System.out.println("error");
        if(ap.equals(ap3)) System.out.println("ap equals ap3");
        if(ap==ap3) System.out.println("ap == ap3");
        
    }
}
