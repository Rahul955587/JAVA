package String;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String name=sc.nextLine();
        sc.close();

        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
        
    }
}
