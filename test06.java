
import java.util.Scanner;

public class test06 {

    public static void main(String[] args) {
        int first = 0, second = 1;
        Scanner obj=new Scanner(System.in);
        System.out.print("enter num: ");
        int n=obj.nextInt();
        System.out.println("fabinaco series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int nextterm = first + second;
            first = second;
            second = nextterm;
        }
        System.out.println("");
        int num = 100, sum = 0;
        for (int i = 1; i <= sum; i++) {
            System.out.println("sum= " + sum);
        }
    }
}
