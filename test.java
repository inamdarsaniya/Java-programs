interface stack {
    int pop();
    void push(int x);
}
class FixedStack implements stack { //this class is for fixed size stack
    private int stck[];
    private  int tos;

    FixedStack(int size) {
        stck=new int [size];
        tos=-1;
    }
    public void push(int x) {
        if(tos<stck.length) {
            stck[++tos]=x;
        }else {
            System.out.println("the stack is full");
        }
    }
    public int pop () {
        if (tos<0) {
            System.out.println("stack underflow");
            return 0;
        }else {
            return stck[tos--];
        }
    }
}
class stackdemo implements stack {//this class is for variable stack
    private int stck[];
    private int tos;

    stackdemo(int size) {
        stck=new int[size];
        tos=-1;
    }
    public void push(int x) {
        {
            if(tos==stck.length-1){
                int temp[]=new int[stck.length*2];
                    for(int i=0;i<stck.length;i++ ){
                        temp[i]=stck[i];
                    }
                stck=temp;
                stck[++tos]=x;
                
            }
            else stck[++tos]=x;
        }
    }
    public int pop() {
        if (tos>=0)  {
            return stck[tos--];
        }else {
            System.out.println("stack underflow");
            return 0;
        }
    }
}

public class test {
    public static void main(String[] args) {

        FixedStack obj2=new FixedStack(5);
        
        stackdemo obj=new stackdemo(7);

        stack ref;
        ref=obj;
        for (int i=0;i<12;i++) ref.push(i);
        for (int i =0;i<12;i++) System.out.println(ref.pop());


        ref=obj2;
        for(int i=0;i<5;i++) ref.push(i);
        for (int j=0;j<5;j++) System.out.println(ref.pop());
        
        
    }
}
