package Array;
import java.util.*;
public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%3==0 && arr[i]%5!=0) System.out.println("Fizz");
            else if (arr[i]%5==0 && arr[i]%3!=0) System.out.println("Buzz");
            else if (arr[i]%5==0 && arr[i]%3==0) System.out.println("FizzBuzz");
            else System.out.println(arr[i]);
        }
        sc.close();
    }
}
