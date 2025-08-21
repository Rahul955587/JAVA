import java.util.Scanner;
public class areaofcir {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Redius=");
        float r = sc.nextFloat();
        double a=(3.14*r*r);
        System.out.println("Area of Circle="+a);
    }
}
