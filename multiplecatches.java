public class multiplecatches {
    public static void main(String[] args) {
        int a=args.length;
        System.out.println("the value of a is "+a);
        int b=0;
        try{b=41/a;
        int c[]={1};
        c[33]=6;
        }catch(ArithmeticException e) {
            System.out.println("divide by 0"+e);
            a=0;
            System.out.println("the val of a is "+a);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("array index oob"+e);
        }System.out.println("after the catch statements");
    }
}
