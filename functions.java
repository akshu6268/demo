
import java.util.Scanner;



public class functions {
    // public static void printmyname(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static int calculatesum(int a,int b){
    //     int sum=a+b;
    //     return sum;
    // }

    public static void printfact(int n){
        if(n<=0){
            System.out.println("invalid number");
        }
        int fact=1;
        for(int i=n; i>=1; i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return; 
    }
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        printfact(n);
        // Scanner obj=new Scanner(System.in);
        // System.out.println("enter name");
        // String name=obj.next();

        // printmyname(name);
        // System.out.println("enter first num ");
        // int a=obj.nextInt();
        // System.out.println("enter second num ");
        // int b=obj.nextInt();

        // int sum=calculatesum(a, b);
        // System.out.println(sum);
    }
}
