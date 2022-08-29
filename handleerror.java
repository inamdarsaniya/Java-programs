import java.util.Random;
public class handleerror {
    public static void main(String[] args) {
      Random r=new Random();
      int c=0;
      for(int i =0;i<10;i++)
      try {
            int a=r.nextInt();
            int b=r.nextInt();
            c=12345/(a/b);
      }catch (ArithmeticException e) {
        System.out.println("exception is "+e);
        c=0;
      }  System.out.println("the value of c is "+c);
    }
}
