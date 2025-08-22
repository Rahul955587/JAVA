import java.util.*;
public class SwapwithoutVa {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A:");
        int a=sc.nextInt();
        System.out.print("Enter B:");
        int b=sc.nextInt();
        a=a+b;  //a=5--3+2 a=3,b=2
        b=a-b;  //5-2=3
        a=a-b;  //5-3=2
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}

    
        
    


