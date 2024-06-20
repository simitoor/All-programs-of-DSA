// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*

Mark is playing a game where he is trying to save the city of Atlantis by throwing grenades at a monster which is trying to destroy the city. Once a monster gets hit with a grenade, it stays inactive for d seconds. So lets say, if monster gets hit at second t it will stay inactive during the inclusive time interval (t,t+d-1) If another grenade is thrown before the effect of previous one ends, the monster remains inactive until d seconds after this new attack.



Given an array of non-decreasing integers attack where attack[i] represents that a grenade is thrown at attack[i] th second, and the value of integer duration d, you need to return the total number of seconds that the monster stayed inactive write optimised code in Java
*/
import java.util.*;
class SalesForce_Q3{
    public static int s(List<Integer> arr,int n)
    {
        int current=0,maxtime=0;
        for(int i=1;i<arr.size();i++)
        {
            current=0;
            if(arr.get(i)-arr.get(i-1)>=n)
            {
                current=n;
            }
            else{
                current+=arr.get(i-1)+n-arr.get(i);
                
            }
            maxtime+=current;
        }
        return maxtime+n;
    }
    public static void main(String[] args) {
          List<Integer> attack = List.of(1, 2, 4, 5, 10); // Example attack times as list
        int d = 2; // Example duration
        
        int inactiveTime = s(attack, d);
        System.out.println("Total inactive time: " + inactiveTime + " seconds");
    }
}