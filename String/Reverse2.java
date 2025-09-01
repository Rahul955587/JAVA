package String;
// import java.util.*;
public class Reverse2 {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder("Rahul");

        for(int i=0;i<name.length()/2;i++){

            int front=i;
            int back=name.length()-1-i;

            char frontChar=name.charAt(front);
            char backChar=name.charAt(back);

            name.setCharAt(front,backChar);
            name.setCharAt(back, frontChar);
        }
        System.out.println(name);
    }
}
