public class SUBARRAYS
{
    public static void MaxsubArraysumBF(int num[])//TIME COMPLEXITY ----> O(n^3)
    {
        int Maxsum = Integer.MIN_VALUE;
        int ts = 0;
        for(int i=0; i<num.length; i++)
        {
            for(int j=i; j<num.length; j++)
            {
                int start = i,end = j,currsum =0;
                for(int k=start; k<=end; k++)
                {
                    currsum += num[k];
                }
                ts++;
                System.out.print(currsum+", ");
                if(Maxsum < currsum)
                    Maxsum = currsum;
            }
        }
        System.out.println("\nMaximum Sum of subarrays by BRUTE FORCE: "+Maxsum+"\nTotal subarrays: "+ts);
    }
    public static void MaxsubArraysumOPT(int [] num)//TIME COMPLEXITY ------> O(n)
    {
        int maxSum=Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0]=num[0];
        for(int i=1; i<prefix.length; i++)
        {
            prefix[i] = prefix[i-1]+num[i];
        }
        //prefix[] = {1,-1,5,4,7}
        for(int i=0;i<num.length; i++)
        {
            int start=i;
            for(int j=0; j<num.length; j++)
            {
                int end = j;
                int currsum = start == 0?prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum < currsum)
                maxSum = currsum;
            }
        }
        System.out.println("The Maximum Subarray Sum by Optimised is: "+maxSum);
    }
    public static void msasKadane(int [] num)//TIME COMPLEXITY ------> O(n)
    {
        int cs=0, ms= Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++)
        {
            cs += num[i];
            if(cs < 0)
                cs=0;
            ms = Math.max(cs,ms);
        }
        System.out.print("Maximum Subarray Sum by Kadane's algorithm: "+ms);
    }
    public static void main(String args[])
    {
        int num[] = {1,-2,6,-1,3};
        MaxsubArraysumBF(num);
        MaxsubArraysumOPT(num);
        msasKadane(num);
    }
}