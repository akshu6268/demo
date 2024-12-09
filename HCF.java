public class HCF{
    public static void main(String[] args) {
        int a=81,b=153;
        int hcf=1;
        int lcm=1;
        for(int i=1; i<=a; i++){
            if(a%i==0 && b%i==0)
            hcf=i;
        }
        System.out.println("hcf of a ad b is: "+hcf);
        lcm=(a*b)/hcf;
        System.out.print("lcm of a and b is: "+lcm);
         System.out.println("");
    }
}