public class lecture8b {
    public static void main(String[] args) {
        //casting
        int x=9;
        double y=x;
        double z=5.89d;
        int b=(int) z;
        System.out.println(b);  //casting
        

        System.out.println(y);
        System.out.println("Size of byte "+Byte.BYTES);
        System.out.println("Size of short "+Short.BYTES);
        System.out.println("Size of int "+Integer.BYTES);
        System.out.println("Size of long "+Long.BYTES);
        System.out.println("Size of float "+Float.BYTES);
        System.out.println("Size of double "+Double.BYTES);
        System.out.println("Size of char "+Character.BYTES);
        
    }
}
