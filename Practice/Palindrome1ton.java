import java.util.*;
public class Palindrome1ton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        int j=0;
        for(int i=1;i<=n;i++){
        int m=i,r=0,s=0;
        while (m>0) {
            r=m%10;
            s=(s*10)+r;
            m=m/10;
        }
        if (s==i) {
            System.out.print(i+" ");
            j=j+1;
        }
        }
        System.out.println(j);
    }
}
