public class supersubcatch {
    public static void main(String[] args) {
       try{ int a,b=0;
            a=41/b;
       }/*catch (Exception c) {
           System.out.println("generic exception catch"+c);
       }catch (ArithmeticException m) {  //cannot execute this as arithmetic exception is  a subclass of exception and hence arithmetic exeception will be handle by execption itself.
           System.out.println("arithmetic exception "+m);
       }*/
       catch (ArithmeticException m) {
           System.out.println("arithmetic exception "+m);
       }catch (Exception c) {
           System.out.println("generic exception catch" +c);
       }

    }
}
