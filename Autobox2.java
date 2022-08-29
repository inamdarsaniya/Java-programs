public class Autobox2 {
    static int m(Integer i) {
        return i;
    }
    public static void main(String[] args) {
        int r=100;
        Integer t=m(r);
        System.out.println("the value is "+t);
    }
}
