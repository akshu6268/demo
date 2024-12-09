import java.util.Scanner;
public class lecture8a {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter day: ");
        int day=obj.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("daturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
            System.out.print("please enter correct key : ");
            break;    
        }
    }
}
