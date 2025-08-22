import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int m=sc.nextInt();
        int rem=0,sum=0;
        while(m>0){
            rem=m%10;
            sum=sum+rem;
            m=m/10;
        }
        System.out.print(sum);
        sc.close();
    }
}
