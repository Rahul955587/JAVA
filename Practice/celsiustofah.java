import java.util.Scanner;
public class celsiustofah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temp in Celsius");
        float t=sc.nextFloat();
        float fah=(t*(9/5))+32;
        System.out.println("Fah Temp="+fah);

    }
}
