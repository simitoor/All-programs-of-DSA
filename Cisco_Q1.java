/*
 Optimal shooting order guidance


User


In the finals of the shooting competition, the last two participants going for the gold are James and Bob. Here are the rules of the competition one last time



1. The two shooters would take turns to shoot.
 2. They shoot at a row of markers (say R markers) which are

even in number to make it fair to the two participants.





3. Each marker has a value written on it. Value is say Ni where I is the Marker Index.

24

25

26

27

4. They can shoot at the end markers only & not in the middle. Else they would be disqualified.

28

29

30 >

5. The winner is the one with the maximum number of points at the end.

James has won the toss and will shoot first. As always, he is confused on the order to shoot. Your goal is to help James win the event by guiding him through the order of markers to hit & hence, determine the maximum number of points he can win. Write optimised code in Java and take input as list
 */
import java.util.*;
public class Cisco_Q1 {
    public static void main(String[] args) {
         int[] markers = {24, 25, 26, 27, 28, 29, 30};
         int jamesScore = 0;
        int bobScore = 0;
     Arrays.sort(markers, Collections.reverseOrder());
        for(int i=0;i<markers.length;i++)
        {
            if(i%2==0)
            jamesScore+=markers[i];
        }
        System.out.print(jamesScore);
    }
}
