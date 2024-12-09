import java.util.Scanner;
public class try1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter a: ");
        int a=obj.nextInt();
        System.out.print("enter b: ");
        int b=obj.nextInt();
        System.out.println("before swaping the num: "+a+" and "+b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swaping: "+a+" and "+b);
    }
}
