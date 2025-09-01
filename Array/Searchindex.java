import java.util.*;
public class Searchindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size:");
        int size=sc.nextInt(); //5
        int [] arr=new int[size];
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<size;i++){
            if(num==arr[i]) System.out.print(i);
        }
    }
}
