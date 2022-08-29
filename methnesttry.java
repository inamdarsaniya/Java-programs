public class methnesttry {
    static void methnest (int a) {
        try{
            if(a==1) {
                a=a/(a-a);
                
            }if(a==2) {
                int arr[]=new int[2];
                arr[41]=4;
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("the oob exception is " +e);
        }
    }
    public static void main(String[] args) {
        int a=args.length;
       try{ int b=41/a;
        methnest(a);
       }catch (ArithmeticException e) {
           System.out.println("the arithmetic exception is "+e);
       }
    }
}
