import java.util.Scanner;
public class lecture5 {
    public static void main(String[] args) {
    int x=19;
    int y=20;
    System.out.println(y%2);
    System.out.println(x%2);
    System.out.println(x/3);
    System.out.println(x%3);
    System.out.println(x/4);
    System.out.println(x%4);
    System.out.println(x%5);
    System.out.println(x/20);
    System.out.println(x%20);

    
    Scanner p =new Scanner(System.in);
    System.out.print("please enter your number: ");
    
    int a=p.nextInt();
    if(a%2==0){
        System.out.println("even number "+a);
    }
    else{
        System.out.println("odd number "+a);
    }


    }
    
}
