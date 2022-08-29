
import java.util.Scanner;
public class Recursive {

    int fact (int i)
    {
        if(i==0){

            return 1;
        }
        return (i * fact(i-1));
    }

    public static void main(String[] args) {
       int num;
       int sum;
       Recursive obj=new Recursive();
       System.out.println("enter the number whose factorial is to be found");
       Scanner sc=new Scanner(System.in);
       num =sc.nextInt();
       sum=obj.fact(num);
       System.out.println("the factorial of"+num+"is "+sum);
    }
    
}
