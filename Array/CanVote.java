package Array;
import java.util.*;
public class CanVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) System.out.println("Invalid Age");
            else if (arr[i]>=18) System.out.println("Can Vote");
            else System.out.println("Can-not-vote");
                }
        sc.close();
       
    }
}
