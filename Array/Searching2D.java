import java.util.*;
public class Searching2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows:");
        int r=sc.nextInt();
        System.out.println("Enter Column:");
        int c=sc.nextInt();
        int [][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;i<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==n) System.out.println("("+i+" "+j+")");
            }
        }
        sc.close();
    }
}
