import java.util.HashMap;



public class iternaityfortickets {
    public static void iter(HashMap <String,String> s)
    {
       String st="";
        HashMap <String,String> rev=new HashMap<>();
        for (String key : s.keySet()) {
            rev.put(s.get(key),key);
        }
        for (String r: s.keySet()) {
            if(!rev.containsKey(r))
            {
                st=r;
                System.out.print(r);
            }
        }
        while(s.get(st)!=null)
        {
            st=s.get(st);
            System.out.print("->"+st); 
        }
    }
    public static void main(String[] args) {
        HashMap <String,String> s=new HashMap<>();
        s.put("Cheenai","Banglore");
        s.put("Mumbai", "Delhi");
        s.put("Goa", "Cheenai");
        s.put("Delhi", "Goa");
       iter(s);
    }
}
