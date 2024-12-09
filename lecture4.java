import java.util.Scanner;
public class lecture4 {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.print("please enter your no. ");
        int x=obj.nextInt();
        for(int i=1;i<=20;i=i+1){
            System.out.print(x*i+" ");
        }
    }
}
