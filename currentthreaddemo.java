public class currentthreaddemo {
    public static void main(String[] args) {
        long a=5000;
        Thread t=Thread.currentThread();
        System.out.println("the current thread is : "+t);  
        t.setName("my thread");
        System.out.println("the changed name of the thread is : "+t);
        try{
            for(int i=5;i>0;i--) {
                System.out.println(i);
                t.sleep(a);
                a-=1000;
            }
        }catch (InterruptedException e) {
            System.out.println("the exception is "+e);
        }
    }
}
