import java.util.PriorityQueue;

public class pathwithmineffort {
     
        static class Info implements Comparable <Info>{
            int x;
            int y;
            int data;
            public Info(int data,int x,int y)
            {
                this.x=x;
                this.data=data;
                this.y=y;
            }
            @Override
            public int compareTo(Info r){
                return this.data-r.data;
            }
        }
        public static int sum=0;
        public static void rew(int arr[][])
        {
          
           PriorityQueue <Info> q=new PriorityQueue<>();
           sum+=arr[0][0];
           int i=0,j=0;
           while(i!=arr.length-1 || j!=arr[0].length-1)
           {
            if(i+1==arr.length && j+1==arr[0].length)
            {
            return;
            }
           if(i+1>=0 && i+1<=arr.length-1)
            {
              q.add(new Info(arr[i+1][j],i+1,j));
            }
            if(j+1>=0 && j+1<=arr[0].length-1)
            {
                q.add(new Info(arr[i][j+1],i,j+1));
            }
            if(i-1 >=0 && i-1<=arr.length-1)
            {
                q.add(new Info(arr[i-1][j],i-1,j));
            }
            sum+=q.peek().data;
            i=q.peek().x;
            j=q.peek().y;
            while(!q.isEmpty()){
            q.remove();
            }
           }
         
        }
        public static void main(String[] args)
             {
            int arr[][]= {{ 31, 100, 65, 12, 18 },
            { 10, 13, 47, 157, 6 },
            { 100, 113, 174, 11, 33 },
            { 88, 124, 41, 20, 140 },
            { 99, 32, 111, 41, 20 } };
            rew(arr);
            System.out.println(sum);
        }
        
        }
       