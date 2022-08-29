class myexception extends Exception {
    private int detail;

    myexception (int a) {
        detail=a;
    }
    public String toString() {
        return ("the exception is "+detail);
    }
}

public class exceptiondemo {
    static void compute (int a) throws myexception {
        System.out.println("called compute method with "+a);
        if(a<10) 
         throw new myexception(a);
         System.out.println("normal exit");
    }
    public static void main(String[] args) {
        try {
            compute(20);
            compute(5);
        }catch (myexception e) {
            System.out.println("caught :"+e);
        }
    }
}
