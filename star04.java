public class star04 {
    public static void main(String[] args) {
// first que
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second que

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(i==1||j==1 || i==5||j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //third que

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //fourth que

        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //fifth que

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //sixth que

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //seventh que

        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        // eigth que

        int number=1;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
        // ninth que

        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("0 ");
                }
                else{
                   System.out.print("1 ");
                }
            }
            System.out.println();
        }
        //tenth que

        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces=2*(4-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces=2*(4-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //11th que

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //12th que
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //13th que

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j+"");
            }
            for(int j=2; j<=i; j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
        //14th que
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*(i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //15th que
        for(int i=4; i>=1; i--){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*(i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
