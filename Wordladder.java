
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
public class Wordladder 
{
    static class Pair
     {
        String first;
        int steps;
        public Pair(String first,int steps)
        {
            this.steps=steps;
            this.first=first;
        }
     }
    public static int sols(String []wordlist,String start,String target)
    {
        if(start==target)
        return 0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(start, 1));
        Set<String> overall=new HashSet<String>();
        for(int i=0;i<wordlist.length;i++)
        {
          overall.add(wordlist[i]);
        }
        overall.remove(start);
        while(!q.isEmpty())
        {
            String s=q.peek().first;
            int key=q.peek().steps;
            q.remove();
            if(s.equals(target))
            return key;
            for(int i=0;i<s.length();i++)
            {
             for(char c='a';c<='z';c++)
             {
                char ch[]=s.toCharArray();
                ch[i]=c;
                String a=new String(ch);
                if(overall.contains(a))
                {
                   q.add(new Pair(a,key+1));
                   overall.remove(a); 
                }
             }
            }
           
        }
        return 0;
    }
    public static void main(String[] args) {
        String []Dictionary = {"poon", "plee", "same", "poie","plea","plie","poin"};
        String start ="toon", target ="plea";
        System.out.println(sols(Dictionary,start,target));
    }
}
