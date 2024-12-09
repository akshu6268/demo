public class largest {
    public static void main(String[] args) {
        int[] arr={12,45,78,321,65,98};
        int min=arr[0];
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("largest is "+max);
        
    }
    
}
