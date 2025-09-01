package String;

public class StringBuild {
    public static void main(String[] args) {
        
        StringBuilder str=new StringBuilder("Welcome");
        //Call by index
        System.out.println(str.charAt(0));
        //length of String
        System.out.println(str.length());
        //Append- Add at last
        System.out.println(str.append("1"));
        //Set-place at given index means assign
        //str.setCharAt(0,"D");

        //Insert at place and push other
        System.out.println(str.insert(0, "D"));

        //Delet(include,not include)
        System.out.println(str.delete(0, 1));

        System.out.println(str.deleteCharAt(7));
    }
}
