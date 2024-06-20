import java.util.Comparator;
import java.util.TreeMap;

public class sortbyfrequency {
    public static void main(String[] args) {
        String s = "cccaaabb";
        TreeMap <Integer,Character> map=new TreeMap<>(Comparator.reverseOrder());
        for(int i=0;i<s.length();i++)
        {
          if(map.containsValue(s.charAt(i)))
          {
            if(s.charAt(i).equals(map.get(key)))
            {
               
            }
            map.put(key,s.charAt(i));
          }
          else{
            map.put(1,s.charAt(i));
          }
        }
        String sol="";
        for (Integer w : map.keySet()) {
            int t=w;          
            while(t!=0)
            {
                sol+=map.get(w);
                t--;
                  }
        }
        System.out.println(sol);
    }
}
