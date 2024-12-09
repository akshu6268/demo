public class main{
    int x=5;
    int y;
    public static void main(String[] args) {
        main myobj1=new main();
        main myobj2=new main();
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);

        main myobj=new main();
        myobj.y=10;
        System.out.println(myobj.y);

        main myobj3=new main();
        myobj.x=25;
        System.out.println(myobj.x);

    }
}

