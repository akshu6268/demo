import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("please enter any num: ");
        int x=obj.nextInt();

        if(x%2==0){
            System.out.println("it is even number");
        }
        else{
            System.out.println("it is odd number");
        }
    }
}
