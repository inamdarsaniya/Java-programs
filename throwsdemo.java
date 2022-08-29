public class throwsdemo {
    static void throwone () throws IllegalAccessException {
        System.out.println("inside the throwone method");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) {
        try {
            throwone();
        }catch (IllegalAccessException e) {
            System.out.println("the exception is "+e);
        }
    }
}
