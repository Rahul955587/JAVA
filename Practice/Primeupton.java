import java.util.Scanner;
public class Primeupton {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter The number:");
       int n=sc.nextInt();
       sc.close();
       int sum=0;
       for(int i=1;i<=n;i++){
        int c=0;
        for(int j=1;j<=i;j++){
            if (i%j==0) {
                c=c+1;
            }
        }
        if (c==2) {
            System.out.println(i);
            sum=sum+1;
        }
        
       }
       System.out.println("Total Prime Numbers:"+sum);
    }
}
