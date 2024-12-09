import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter starting range (x): ");
        int start=obj.nextInt();
        System.out.println("enter ending range (y): ");
        int end= obj.nextInt();

        int evensum=0;
        int oddsum=0;

        System.out.println("even and odd nums are: ");
        for(int i=start; i<=end; i++){
            if(i%2==0){
                System.out.println(i+" even num");
                evensum=evensum+i;
            }
            else{
                System.out.println(i+" odd num");
                oddsum=oddsum+i;
            }
        }

       
        System.out.println("sum of all even num: "+evensum);
        System.out.println("sum of all odd num: "+oddsum);
    }
}
