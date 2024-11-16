import java.util.*;

public class TreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,String> m = new TreeMap<Integer,String>();
        m.put(2,"two");
        m.put(1,"one");
        m.put(3,"three");
        Map<Integer,Integer> mm = new TreeMap<Integer,Integer>();
        mm.put(2,1);
        mm.put(1,2);
        mm.put(3,1);

       
        System.out.println(mm);

    }
}
