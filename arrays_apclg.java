
import java.util.Scanner;

public class arrays_apclg{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int numbers[]=new int[size];
        //input
        for(int i=0; i<=size; i++){
            numbers[i]=obj.nextInt();
        }
        //output
        for(int i=0; i<=size; i++){
            System.out.println(numbers[i]);
        }
    }
}