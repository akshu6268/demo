import java.util.HashSet;
public class RDC {
    static int removedublicates(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        
        int x = 0;  

        for (int i = 0; i < arr.length; i++) {
            if (!s.contains(arr[i])) { 
                s.add(arr[i]);  
                arr[x++] = arr[i];  
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int[] arr={1,1,3,3,5,8,6,6,8,7};
        int newsize=removedublicates(arr);

        for(int i=0; i<newsize; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
