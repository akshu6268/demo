
import java.util.ArrayList;
import java.util.Collections;

public class apclg_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();

        //add element
        list.add(0);
        list.add(2);
        list.add(3);
        //list.add(5);
        System.out.println(list);

        //get element
        int element=list.get(0);
        System.out.println(element);

        //add element in between 
        list.add(1, 1);
        list.add(0,4);
        System.out.println(list);

        //set element
        list.set(2, 22);
        System.out.println(list);

        //delete element
        list.remove(1);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(list);

        //loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting 
        Collections.sort(list);
        System.out.println(list);

    }

}
