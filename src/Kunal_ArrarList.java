import java.lang.reflect.Array;
import java.util.ArrayList;

public class Kunal_ArrarList {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(671);
        list.add(627);
        list.add(673);
        list.add(674);
        list.add(675);
     //   System.out.println( list.contains(673));
        list.set(2,800);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

    }
}
