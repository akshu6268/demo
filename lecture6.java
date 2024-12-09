import java.util.Scanner;
public class lecture6 {
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.print("please enter your num: ");
        int x=obj.nextInt();
        int temp=0;
        if(x<0){
            System.out.print("please enter positive number: " +x);
        }
        if(x==0|| x==1){
            System.out.print("it is not prime number: "+ x);
        }
        if (x>1) {
            for(int a=2; a<x/2; a++){
                if(x%a==0){
                    temp=1;
                  //System.out.println("number is divisible by "+a);
                  break;
                }
            }
            if(temp==0){
                System.out.println("it is a prime number "+ x);
            }
            else{
                System.out.println("it is not a prime number " + x);
            }
        }
    }
}
