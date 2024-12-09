import java.util.Scanner;
public class randomnum{
    public static void main(String[] args){
        System.out.print("enter any num to cheak prime: ");
        int temp=0;
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        if(x<0){
            System.out.println("please enter positive number:"+x);
        }
        if(x==0||x==1){
            System.out.println("it is not prime number:"+x);
        }
        if(x>1){
            for(int i=2; i<x; i++){
                if(x%i==0){
                    temp=1;
                    break;
                }
            }
            if(temp==0){
                System.out.println("it is  prime num:"+x);
            }
            else{
                System.out.println("it is not prime:"+x);
            }
        }
    }
}