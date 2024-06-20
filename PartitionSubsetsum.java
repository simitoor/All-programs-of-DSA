public class PartitionSubsetsum {
    
        public int check(int n,int nums[],int sum,int dp[][])
            {
              if(n>nums.length)
              return false;
              if(sum<0)
              return false;
              if(sum==0)
              return true;
              if(dp[n][sum]!=-1)         
              return dp[n][sum];
              bool incl=check(n++,nums,sum-nums[n],dp);
              bool excl=check(n++,nums,sum,dp);
              dp[n][sum] = incl | excl;
              return dp[n][sum];
            }
            public boolean canPartition(int[] nums) {
             int sum=0;
             
             for(int i=0;i<nums.length;i++)
             sum+=nums[i];
            
             if(sum%2==0)
             {
                  int dp[][]=new int[nums.length+1][sum/2+1];
                  
                 if(check(0,nums,sum/2,dp))
                 return true;
             }
              return false;  
            }
        }

