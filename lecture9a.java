public class lecture9a {
    //user define function
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void subtract(long p,long q){
        System.out.println(p-q);
    }
    static void multipy(int r,int s){
        System.out.println(s*r);
    }
    static void divide(float f,float g){
        System.out.println(f/g);
    }
    static void fullname(String a,String b){
        System.out.println(a+b);
    }
    static void double1(double c,double d){
        System.out.println(c*d);
    }
    
    
//main function
    public static void main(String[] args) {
       
        add(2,5);
        add(100,200 );
        divide(3.5f,2.5f );
        fullname("akshat ", "keshari");
        double1(5.25d,6.75d);
        subtract(200l, 525l);
    }
}
