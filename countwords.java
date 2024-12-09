import java.util.Scanner;
public class countwords {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("please type a sentence : ");
        String words = obj.nextLine();
        int countwords= words.split("").length;
        System.out.print(countwords);
        
    }
}