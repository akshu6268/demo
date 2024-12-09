import java.util.Scanner;
public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char P, char Q, char R) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + P + " to rod " +Q);
            return;
        }
        towerOfHanoi(n - 1, P, R, Q);
        System.out.println("Move disk " + n + " from rod " + P + " to rod " + Q);
        towerOfHanoi(n - 1, R, Q, P);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter any number: ");
        int n=obj.nextInt();
        
        //int n = 2; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B, and C are the names of the rods
    }
}