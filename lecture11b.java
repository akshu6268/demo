import java.util.Scanner;
public class lecture11b {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.print("please enter size of array: ");
        int size=obj.nextInt();
        String x[]=new String[size];
        obj.nextLine();
        System.out.print("enter the value: ");
        for(int k=0; k<size; k++){
            x[k]=obj.nextLine();
        }
        System.out.print("output of array. ");
        for(String a:x){
            System.out.print(a+" "); 
        }
    }
}