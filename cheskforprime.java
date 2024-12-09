import java.util.Scanner;
public class cheskforprime{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter num  to cheak prime: ");
        int x=obj.nextInt();
        int temp=0;

        if(x<0){
            System.out.println("please eneter positive numbber");
        }
        if(x==0||x==1){
            System.out.println("it is not prime");
        }
        if(x>1){
            for(int a=2; a<x; a++){
                if(x%a==0){
                temp=1;
                break;
            }
        }
        if(temp==0){
            System.out.println("it is prime num");
        }
        else{
            System.out.println("it is not prime");
        }
    }
    }
}