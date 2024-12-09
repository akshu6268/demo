import java.util.Scanner;
public class try2{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size=obj.nextInt();
        int[] array=new int[size];
        System.out.print("enter "+size+" element ");
        for(int i=0;i<size; i++){
        array[i]=obj.nextInt();
       }
       System.out.print("array element: ");
       for(int i=0; i<size; i++){
        System.out.print(array[i]+" ");
       }
    }
}