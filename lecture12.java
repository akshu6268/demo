 import java.util.Arrays;
import java.util.HashSet;

public class lecture12 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 4, 5, 4};

        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add elements from the array to the HashSet
        for (int a=0; a<array.length; a++) {
            set.add(array[a]);
        }

        // Convert the HashSet back to an array
        int[] result = new int[set.size()];
        int i = 0;
        for (int element : set) {
            result[i++] = element;
        }

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}
