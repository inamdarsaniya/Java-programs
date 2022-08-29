//program to learn interface 1

interface callback {
   public void callme(int p);
}
class client implements callback {
    public void callme(int p) {
        System.out.println("client class implements callme with "+p);
    }
    public void call2() {
        System.out.println("an independent method is implemented inside client");
    }
}
class Anotherclass implements callback {
    public void callme(int p) {
        System.out.println("another class implements callme with "+p);
    }
}


public class test1face {
    public static void main(String[] args) {
       client cl=new client();
       cl.callme(74);
       cl.call2();

       callback obj =new client();
       obj.callme(41);
        
       Anotherclass obj2=new Anotherclass();
       obj=obj2;
       obj.callme(41);
    }
    
}
