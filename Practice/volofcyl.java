import java.util.Scanner;
public class volofcyl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Redius=");
        float r= sc.nextFloat();
        System.out.println("Enter Height=");
        float h= sc.nextFloat();
        double vol=3.14*r*r*h;
        System.out.println("Vol of Cyl= "+vol+" cm"+"cube");
        sc.close();
    }
    
}
