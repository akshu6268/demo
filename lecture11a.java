import java.util.Scanner;
public class lecture11a {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.print("please enter size of array: ");
        int size=obj.nextInt();
        int x[]=new int[size];
        System.out.print("enter the value: ");
        for(int i=0; i<size; i++){
            x[i]=obj.nextInt();
        }
        System.out.print("output of array. ");
        for(int a=0; a<size; a++){
            System.out.print(x[a]+" ");
        }
    }
}
