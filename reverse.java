public class reverse {
    public static void main(String[] args){
        String originalstr="hello mr";
        String reversestr="";
        for(int i=0; i < originalstr.length(); i++){
            reversestr =originalstr.charAt(i)+ reversestr;
        }
        System.out.print("reversestr: "+reversestr);
    }
}
