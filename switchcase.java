import java.util.Scanner;
public class switchcase {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);

        System.out.println("enter the first number");
    int num1 = sc.nextInt();
    System.out.println("enter the second number");
    int num2 = sc.nextInt();
    System.out.println("enter the operator");
    char opt=sc.next().charAt(0);
    switch (opt)
    {
        case '+':
        {    System.out.println("addition : "+(num1+num2));
        break;
        }
        case '-':
        {
            System.out.println("substraction :" +(num1-num2));
            break;
        }
        default: {
            System.out.println("operation not found");

        }
    }
}
}
