import java.util.Scanner;
public class yehaijava {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size=obj.nextInt();

        int[] array= new int[size];
        System.out.println("enter the element of size: ");
        for(int i=0; i<size; i++){ 
            array[i]=obj.nextInt();
        }
        System.out.print("entered array is: ");
        for(int i=0; i<size; i++){
            System.out.println(array[i]+" ");
        }
        
    }
}
