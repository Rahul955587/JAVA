import java.util.*;
public class Storenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<=0){
                break;
            }
        }
        double sum=0.0;
        for(int i=0;i<arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
