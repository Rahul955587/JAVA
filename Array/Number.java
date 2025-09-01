import java.util.*;
public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] ar=new int[5];
        for(int i=0;i<5;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0) System.out.println("Zero");
            else if(ar[i]>0){
                if(ar[i]%2==0) System.out.println("Even");
                else System.out.println("Odd");
            }
            else System.out.println("Negative");
        }
        sc.close();
    }
}
