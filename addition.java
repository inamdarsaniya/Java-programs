public class addition {
    int x,y;
    addition(int i,int j) {
        x=i;
        y=j;

    }
    int add () {
        return (x+y);
    }
    public static void main(String[] args) {
        addition obj1=new addition(7,9);
        System.out.println("the sum is  "+obj1.add());
        
    }
}
