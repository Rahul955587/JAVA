import java.util.*;
public class Armstrong1ton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        int m=i,r=0,s=0;
        while (m>0) {
            r=m%10;
            s=s+(r*r*r);
            m=m/10;
        }
        if (s==i) {
            System.out.println(i);
        }
        }
    }
}
