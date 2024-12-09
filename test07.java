import java.util.Scanner;
public class test07 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter number: ");
        int x=obj.nextInt();
        
       // System.out.println("length full of hurry and curry should be fundamentaly complete best before time and this should be done with out any hesitation thankyou! ");
        if(x%2==0){
            System.out.println("even num: "+x);
        }
        else{
            System.out.println("odd num: "+x);
        }
    }
}

