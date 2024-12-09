public class apclg_recursion1{
    // public static void printnum(int n){
    //     if(n==0){//(n==6)
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printnum(n-1);//n+1
    // }
    // public static void main(String[] args) {
    //     int n=5;//n==1
    //     printnum(n);
    // }

    //2nd case

    // public static void printsum(int i,int n,int sum){
    //     if(i==n){
    //         sum=sum+i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum +=i;
    //     printsum(i+1,n,sum);
    // }
    // public static void main(String[] args) {
    //     printsum(1,5,0);
    // }

    //3rd 

    // public static long factorial(int n) {
    //     if (n == 0 || n == 1) { // Base case
    //         return 1;
    //     }
    //     return n * factorial(n - 1); // Recursive call
    // }

    // public static void main(String[] args) {
    //     int number = 5; // Number to calculate factorial
    //     long result = factorial(number);
    //     System.out.println("The factorial of " + number + " is: " + result);
    // }

    //4th

    // public static void printfib(int a,int b,int n){
    //     if(n==0){
    //         return;
    //     }
    //     int c=a+b;
    //     System.out.print(c+" ");
    //     printfib(b, c, n-1);
    // }
    // public static void main(String[] args) {
    //    int a=0;
    //    int b=1;
    //    System.out.print(a+" ");
    //    System.out.print(b+" ");
    //    int n=17;
    //    printfib(a, b, n-2); 
    // }

    //5th

    public static int  calcpow(int n,int x){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpownm1=calcpow(n-1, x);
        int xpown =x*xpownm1;
        return xpown;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcpow(n, x);
        System.out.println(ans);
    }
} 
