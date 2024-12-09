import java.util.Arrays;

public class arrayshort {
    public static void main(String[] args) {
        String[] cars={"thar","lamborghini","bmw","mercedes"};
        Arrays.sort(cars);
        for(String i :cars){
            System.out.println(i);
        }
    }
}
