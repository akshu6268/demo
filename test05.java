public class test05 {
    public static void main(String[] args) {
        int n=10,first=0,second=1;
        System.out.print("fabinaco series = ");
        for(int i=1; i<=n; i++){
            System.out.print(first+" ");

            int nextterm=first+second;
           first=second;
            second=nextterm;
        }
        System.out.println("");
        int num=100,sum=0;
        for(int i=1; i<=num; i++){
            sum=sum+i;
        }
        System.out.println("sum= "+sum);
        // sum of all array element
        int[] arr={1,45,32,65,12};
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum is: "+sum);
        
    }
}