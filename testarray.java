import java.util.Scanner;
public class testarray {
    static void display(int a[]) {
        System.out.println("the array elements are :");
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
    static int largest(int a[]) {
        int lar=a[0];
        for (int i=1;i<a.length;i++) {
            if (lar<a[i]) {
                lar=a[i];
            }
        }
        return lar;
    }
    static void display(int a[][],int t,int b) {
        for (int i=0;i<t;i++) {
            for(int j=0;j<b;j++) {
                System.out.print(a[i][j]+"     ");
            }
            System.out.println();
        }    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements of the array");
        int num=sc.nextInt();
        System.out.println("enter the elements of the array");
        int arr[]=new int[num];
        for (int i=0;i<num;i++) {
            arr[i]=sc.nextInt();
        }
        display(arr);
        System.out.println("the largest element of the array is "+largest(arr));
        System.out.println("enter the no of rows and columns in the two d array ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr2 [][]=new int[m][n];
        System.out.println("enter the elements of the two d array ");
        for (int j=0;j<m;j++) {
            for(int k=0;k<n;k++) {
                arr2[j][k]=sc.nextInt();
            }
        }
        display(arr2,m,n);
    }

}
