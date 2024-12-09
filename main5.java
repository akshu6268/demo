public class main5 {
    final int x=5;
    final double PI=3.14;

    public String fname="jhon";
    public int age=14;
    
    public static void main(String[] args) {
        main5 myobj=new main5();
        // myobj.x=50;     this will generete error:
        // myobj.PI=25;     this will generate errror:
        System.out.println(myobj.x);
    }
}
