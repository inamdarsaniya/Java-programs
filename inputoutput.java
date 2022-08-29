import java.util.Scanner;
public class inputoutput {
    int length,breadth;
    static int rectarea (int length,int breadth) {
        length=length;
        breadth=breadth;
        return (length*breadth);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimensions of the rectangle");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        System.out.println("the area of the rectangle is :"+rectarea(length,breadth));
    }
}
