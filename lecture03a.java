import java.util.Scanner;
//import java.util.*;
public class lecture03a {
    public static void main(String[] args) {
        Scanner myobj =new Scanner(System.in);
        System.out.print("please enter your first name: ");
        String fname=myobj.nextLine();
        System.out.print("please enter your last name: ");
        String lname=myobj.nextLine();
        System.out.print("Hello "+fname+" ");
        System.out.print(lname+" welcome to ssi");
    }
}
