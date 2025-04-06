import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    //can only store objects not non primitive datatypes, uses heap instead of stack
    public static void main(String[] args) {
        //Integer | Float | Boolean | String | Double
        //generally use capital letters for non primitive object datatypes
        ArrayList<Integer> name= new ArrayList<>();
        ArrayList<String> str= new ArrayList<>();

        //add elements
        name.add(0);
        name.add(13);
        System.out.println(name);
        System.out.println(name.get(0));

        //add elem in between
        name.add(0,1);
        System.out.println(name);

        //set element in between
        name.set(0,5);
        System.out.println(name);

        //delete elem
        name.remove(1);
        System.out.println(name);
        System.out.println(name.size());

        //sorting
        name.add(12);
        name.add(1);
        Collections.sort(name);
        System.out.println(name);
    }
}
