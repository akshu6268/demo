class pen {
    String colour;
    String type;

    public void write(){
        System.out.println("write something");
    }

    public void printcolour(){
        System.out.println(this.colour+" "+this.type+" pen");
        
    }

}
public class apclg_oops {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.colour="blue";
        pen1.type="gel";

        pen pen2=new pen();
        pen2.colour="black";
        pen2.type="ballpoint";

        pen1.printcolour();
        pen2.printcolour();
        
    }
}
