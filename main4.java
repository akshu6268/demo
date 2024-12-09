public class main4 {
    int x;
    public main4(int y){
        x=y;
    }
    int modelyear;
    String modelname;
    public main4(int year,String name){
        modelyear=year;
        modelname=name;
    }
    public static void main(String[] args) {
       main4 myobj=new main4(5);
       System.out.println();
       main4 mycar=new main4(1996,"mustang");
       System.out.println(mycar.modelyear+" "+mycar.modelname);
    }
}
