import java.util.Scanner;
public class Matrixtranspose {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Rows:");
        int r=sc.nextInt();

        System.out.print("Enter Column:");
        int c=sc.nextInt();

        int [][] arr=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your transpose Matrix");
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
