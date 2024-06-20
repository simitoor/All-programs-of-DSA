import java.util.HashMap;

public class validanagram {
    public static boolean checking(String s,String t)
    {
        if(s.length()!=t.length())
        {
            flag=1;
        return false;
        } 
        return true;
    }
    public static int flag=0;
    public static void main(String[] args) {
        String s="knee";
        String t="keen";
      
        if(checking(s,t)){
        HashMap<Character,Integer> s1=new HashMap<>();
        HashMap <Character,Integer> t1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            s1.put(s.charAt(i), s1.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            t1.put(t.charAt(i),t1.getOrDefault(t.charAt(i), 0)+1);
        }
      
        for (Character w: s1.keySet()) {
            if(s1.get(w)!=t1.get(w))
            {
               flag=1;
               break;
            }
        }
     }
        if(flag==1)
        {
            System.out.println("It is not valid");
        }
        else{
            System.out.println("It is valid");
        }
    }
}
