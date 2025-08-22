import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        int m=n,r=0,s=0;
        while (m>0) {
            r=m%10;
            s=s+(r*r*r);
            m=m/10;
        }
        if (s==n) {
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number not Armstrong");
        }
        sc.close();
    }
}
