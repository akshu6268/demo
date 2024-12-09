public class minimum {
    public static void main(String[] args) {
        int[] arr={12,45,56,1,78,65};
        int min=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("smallest number is: "+min);
    }
}