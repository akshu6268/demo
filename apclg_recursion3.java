
import java.util.*;

public class apclg_recursion3 {
    // public static void printper(String str,String permutation){
    //     if(str.length()==0){
    //         System.out.println(permutation);
    //         return;
    //     }
    //     for(int i=0; i<str.length(); i++){
    //         char currChar=str.charAt(i);
    //         //"abc"->"bc";
    //         String newstr=str.substring(0,i)+str.substring(i+1);
    //         printper(newstr, permutation+currChar);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str="123";
    //     printper(str,"");
    // }

    //2nd que

    // public static int countpaths(int i,int j,int n,int m){
    //     if(i==n || j==m){
    //         return 0;
    //     }
    //     if(i==n-1 && j==m-1){
    //         return 1;
    //     }
    //     //move downwards
    //     int downpaths=countpaths(i+1, j, n, m);
    //     //move rightwards
    //     int rightpaths=countpaths(i, j+1, n, m);

    //     return downpaths+rightpaths;
    // }

    // public static void main(String[] args) {
    //     int n=3;
    //     int m=3;
    //     int totalpaths=countpaths(0, 0, n, m);
    //     System.out.println(totalpaths);
    // }

    //3rd que

    // public static int placetiles(int n,int m){
    //     if(n==m){
    //         return 2;
    //     }
    //     if(n<m){
    //         return 1;
    //     }
    //     //vertically
    //     int verticallyplace=placetiles(n-m, m);
    //     //horizontally
    //     int horizontallyplace=placetiles(n-1, m);

    //     return verticallyplace+horizontallyplace;
    // }

    // public static void main(String[] args) {
    //  int n=4;
    //  int m=2;
    //  System.out.println(placetiles(n, m));   
    // }

    //4th que

    // public static int callguest(int n){
    //     if(n<=1){
    //         return 1;
    //     }
    //     //single
    //     int way1=callguest(n-1);
    //     //pair
    //     int way2=(n-1) *callguest(n-2);

    //     return way1+way2;
    // }

    // public static void main(String[] args) {
    //     int n=4;
    //     System.out.println(callguest(n));
    // }

    //5th que

    public static void printsubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findsubset(int n,ArrayList<Integer> subset){
        if(n==0){
            printsubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        findsubset(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findsubset(n-1, subset);

    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset =new ArrayList<>();
        findsubset(n, subset);

    }
}
