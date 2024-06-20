import java.util.*;
public class jobsquencing {
    static class Job
    {
        char pid;
        int deadline;
        int profit;
        public Job(char pid,int deadline,int profit)
         {
            this.pid=pid;
            this.deadline=deadline;
            this.profit=profit;
         }
    }
    public static void printJobScheduling(ArrayList <Job> arr)
    {
       int n=arr.size();
       Collections.sort(arr,(a, b) -> b.profit - a.profit);//descending order 
       int maxi=0;
       for(int i=0;i<n;i++)
       {
        if(arr.get(i).deadline>maxi)
        {
            maxi=arr.get(i).deadline;
        }
       }
       int sol[]=new int [maxi];
       for(int i=0;i<maxi;i++)
       {
        sol[i]=-1;
       }
       int currentjob=0,profitjob=0;
       for(int i=0;i<n;i++)
       {
        for(int j=(arr.get(i)).deadline-1;j>=0;j--)
        {
          if(sol[j]==-1)
          {
            sol[j]=i;
            profitjob+=arr.get(i).profit;
            currentjob++;
            break;
         }
        }
       }
       System.out.println(currentjob);
       System.out.println(profitjob);
    }
    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<Job>();
 
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));
       
        System.out.println("Following is maximum "
                           + "profit sequence of jobs");
 
        // Function call
        printJobScheduling(arr); 
    }

}
