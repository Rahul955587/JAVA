import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
