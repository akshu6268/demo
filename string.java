public class string {
    public static void main(String[] args) {
        String fname="akshat";
        String lname="keshari";
        String fullname=fname+" "+lname;
        System.out.println(fullname.length());

        for(int i=0; i<fullname.length(); i++){
            System.out.print(fullname.charAt(i));
        }
        System.out.println();
        if(fname.compareTo(lname)==0){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        String sentence="my name is akshat keshari ";
        String name=sentence.substring(11,sentence.length());
        String name1=sentence.substring(0,5);

        System.out.println(name);
        System.out.println(name1);
        
    }
}
