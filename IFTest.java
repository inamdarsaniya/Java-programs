interface IntStack {
    void push(int x);
    int pop();
}
 

public class IFTest {
    public static void main(String[] args) {
        FixedStack obj=new FixedStack(5);
        FixedStack obj1=new FixedStack(8);
        for(int i=0;i<5;i++) obj.push(i);
        for(int i=0;i<8;i++) obj1.push(i);

        for (int j=0;j<5;j++) System.out.println(obj.pop());
        for (int j=0;j<8;j++) System.out.println(obj1.pop());
    }
}
