import java.util.Scanner;
public class test03 {
    public static void main(String[] args, int i) {
        // pelendrome number
        Scanner obj=new Scanner(System.in);
        System.out.println("enter starting num: ");
        int a=obj.nextInt();
        System.out.println("enter ending num: ");
        int b=obj.nextInt();
        int x;
        
        int temp=x,rem,sum=0;

        while(x>0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        System.out.println("revese of a given num is "+sum);
        if(sum==temp){
            System.out.println("palindrome "+i );
        }
        else{
            System.out.println("not palindrome "+temp);
        }
    }
}
