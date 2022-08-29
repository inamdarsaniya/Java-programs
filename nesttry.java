public class nesttry {
    public static void main(String[] args) {
        int a=args.length;
        try{
            int b=41/a;
            System.out.println("the val of a is "+a);
            try{
                if(a==1) {
                    a=a/(a-a);
                }
                if(a==2) {
                    int c[]=new int [2];
                    c[3]=41;
                }
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("array index exception "+e);
            }
        }catch (ArithmeticException e) {
            System.out.println("arithmetic exception "+e);
            a=0;
            System.out.println("the value of a is "+a);
        }

    }
}
