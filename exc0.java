class exc0 {
    static void test() {
        int a,b=2;
        try {
        System.out.println("inside try");
        a=42/b;
        System.out.println("the value of a is "+a);
        b=0;
        a=42/b;
        System.out.println("the value of a is "+a);
        
        }catch (ArithmeticException d) {
            System.out.println("division by zero "+d);
        }System.out.println("after catch statement");
    }
    public static void main(String[] args) {
        test();
    }
}