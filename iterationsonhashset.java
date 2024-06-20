import java.util.HashSet;
import java.util.Iterator;

public class iterationsonhashset {
    public static void main(String[] args) {
        HashSet<String> s=new HashSet<>();
        s.add("Moscow");
        s.add("Berlin");
        s.add("Tokyo");
        s.add("Helinsiki");
        
        Iterator it=s.iterator();
        /*while(it.hasNext())
        {
            System.out.println(it.next());
        }*/
       for (String s1 : s) {
        System.out.println(s1);
       }
    }
}
