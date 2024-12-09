import java.util.Scanner;
public class test04 {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("enter starting num: ");
        int a=obj.nextInt();
        System.out.println("enter ending num: ");
        int b=obj.nextInt();

        for(int x=a; x<=b; x++){
            int temp=0;
        if(x<0){
            System.out.println("enter +ve num "+x);
        }
        if(x==0||x==1){
            System.out.println("it is snot prime "+x);
        }
        if(x>1){
            for(int j=2; j<x; j++){
                if(x%j==0){
                    temp=1;
                    break;
                }
            }
            if(temp==0){
                System.out.println("it is a prime num "+x);
            }
            else{
                System.out.println("it is not prime num "+x);
            }
        }
        }
    }
}