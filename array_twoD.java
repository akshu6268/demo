import java.util.Scanner;
public class array_twoD{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int rows=obj.nextInt();
        int cols=obj.nextInt();

        int[][] numbers=new int[rows][cols];
        //input
        //rows
        for(int i=0; i<rows; i++){
            //coloums
            for(int j=0; j<cols; j++){
                numbers[i][j]=obj.nextInt();
            }
        }
        //found number
        int x=obj.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at location "+i+" "+", "+j);
                }
            }
        }

        //output
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         System.out.print(numbers[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
    }
}
