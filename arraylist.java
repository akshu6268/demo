public class arraylist {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int even=0, odd=0;

        // Loop to find even, odd sum
        
        for (int i=0; i<arr.length; i++) {
            if (i%2==0) {
                even =even+ arr[i];
            }
            else{
                odd =odd+ arr[i];
        }
    }
        System.out.println("sum of all even: " + even);
        System.out.println("sum of all odd: " + odd);
    }
}