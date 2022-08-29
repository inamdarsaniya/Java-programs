import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num>0) {
            System.out.println("the number is positive");
        }else if (num<0) {
            System.out.println("the number is negative");
        }else {
            System.out.println("the number is zero");
        }   
    }
    
}
