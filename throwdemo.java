public class throwdemo {
    static public void demothrow () {
       try {
           throw new NullPointerException("demo");
       }catch (NullPointerException e) {
           System.out.println("caught inside catch statement");
           throw e;
       }
    }
    public static void main(String[] args) {
        try {
            demothrow();
        }catch (NullPointerException e) {
            System.out.println("recaught in :"+e);
        }
    }
}