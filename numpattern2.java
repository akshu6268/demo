public class numpattern2 {
    public static void main(String[] args) {
        int count= 0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
           for(int j=i-1;j>=1;j--){
            System.out.print(j);
           }
           System.out.println(" ");
        }
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}