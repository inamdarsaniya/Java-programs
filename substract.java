import java.util.Scanner;
public  class substract {
   static int sub(int x,int y) {
        return (x-y);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the first number");
       int num1=sc.nextInt();
       System.out.println("enter the second number");
       int num2=sc.nextInt(); 
       System.out.println("the substraction of the two nos is  "+sub(num1,num2));
    }
}