import java.util.*;
import java.lang.*;
public class Mapping {
    public static void main(String args[]){
        Map<Integer,String> mp=new HashMap<>();
        mp.put(1,"one");
        mp.put(2,"two");
        mp.put(3,"three");
        mp.put(4,"four");
        mp.put(5,"five");
        System.out.println(mp.get(2));
        System.out.println(mp.getOrDefault(6,"0"));

        //printing all keys
        Set<Integer> keys=mp.keySet();
        for(int key:keys){
            System.out.println(key);
        }
        //printing all  values
        Collection<String> values = mp.values();
        for(String value:values){
            System.out.println(value);
        }
        //printing key- value pair
        for(Map.Entry<Integer, String> entry: mp.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +"---"+ value);
        }
        System.out.println(mp.size());
        System.out.println(mp.containsValue("two"));//true
        System.out.println(mp.containsValue("seven"));//false
        System.out.println(mp.containsKey(1));//true
        System.out.println(mp.containsKey(7));//false
        mp.putIfAbsent(6,"six");
        mp.replace(2,"TWO");
         System.out.println("---"+ mp.get(6) );
         System.out.println("---"+ mp.get(2) );
         System.out.println("---"+ mp.get(12) );
         mp.put(101,"HundredOne");
         System.out.println("---"+ mp.get(101) );
         boolean check = mp.remove(101,"HundredOne"); //  mp.remove(101);
         System.out.println(check);
         System.out.println(mp);
         mp.clear();
         System.out.println(mp);
         System.out.println(mp.isEmpty());

         for(String val : mp.values()){
            System.out.print(val+" ");
         }
         
         String string = "aabbbcc";
         HashMap<Character,Integer> map = new HashMap<>();
         for(int i=0;i<string.length();i++){
            char c = string.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
         }
         StringBuilder str = new StringBuilder();
         for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char key = entry.getKey();
            int freq = entry.getValue();
            str.append(String.valueOf(key).repeat(Math.max(0,freq)));
         }
         System.out.println(str.toString());
        }
}
