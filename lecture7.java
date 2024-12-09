import java.util.Scanner;
public class lecture7 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("please enter any year: ");
        int year=obj.nextInt();
        if(year%400==0 && year%100==0){
            System.out.print("yes it is a leap year "+year);
        }
        else if(year%4==0 && year%100!=0){
            System.out.print("yes it is a leap year : "+year);
        }
        else{
            System.out.print("no it is not a leap year :"+year);
        }
    }
}
