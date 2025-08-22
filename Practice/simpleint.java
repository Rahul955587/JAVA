import java.util.Scanner;
public class simpleint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Prin=");
        int p=sc.nextInt();
        System.out.print("Enter Int Rate=");
        int r=sc.nextInt();
        System.err.print("Enter Time=");
        int t = sc.nextInt();
        float si=(p*r*t)/100;
        System.out.println("Simple Interest="+si);
        sc.close();
    }
    
}
