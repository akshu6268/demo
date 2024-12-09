

public class main3 {
    static void mymethod(){
        System.out.println("hello world");
    }
    static void mystaticmethod (){
        System.out.println("static void method can be called without creting object");
    }
    public void mypublicmethod (){
        System.out.println("public method must be called by creating objects");
    }
    public void fullthrottle (){
        System.out.println("the car is going as fast as it can");
    }
    public void speed(int maxspeed){
        System.out.println("max speed is: "+maxspeed);
    }
    public static void main(String[] args) {
        mymethod();
        mystaticmethod();
        // mypublicmethod(); it can't be called like this 


        main3 myobj=new main3();
        myobj.mypublicmethod();
        
        main3 mycar=new main3();
        mycar.fullthrottle();
        mycar.speed(299);
    }
    

}
