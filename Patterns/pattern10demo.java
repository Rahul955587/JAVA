public class pattern10demo {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=5;
        int space=n-1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("*");
                j++;
            }
            row++;
            space--;
            System.out.println();



        }
        
    }
    
}
