import java.util.*;
public class FreqUsingMap {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        a.add(1);
        a.add(12);
        a.add(10);
        a.add(11);
        a.add(1);
        a.add(12);
        a.add(10);
        a.add(11);
        a.add(10);
        a.add(15);
        for(int i=0;i<a.size();i++)
        {
            int k=a.get(i);
            if(m.containsKey(k))
            {
                m.put(k,m.get(k)+1);
            }
            else
             m.put(k,1);
        }
        System.out.println(m);
        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            System.out.println("Number: "+entry.getKey() +" Freq: "+entry.getValue());
        }
    }
}
