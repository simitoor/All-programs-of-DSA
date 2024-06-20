import java.util.*;
public class iterationsonhashmap{
    public static void main(String[] args) {
       HashMap <String,Integer> map=new HashMap<>();
       map.put("India",56);
       map.put("Us",45);
       map.put("China",75);
       Set <String> keys=map.keySet();
       for (String k : keys) {
        System.out.println(k+" "+map.get(k));
       }
    }
}