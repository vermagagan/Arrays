//TIME COMPLEXITY ------> O(n)
public class TRAPPING_RAINWATER
{
    public static void trappedWater(int [] height)
    {
        int n=height.length;
        int leftmax[] = new int[n];
        int rightmax[] =new int[n];
        
        
        leftmax[0] = height[0];
        for(int i=1; i<n; i++)
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--)
            rightmax[i] = Math.max(rightmax[i+1], height[i]);

        int waterlevel = 0,trappedwater = 0;
        for(int i=0; i<n; i++)
        {
            waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - height[i];
        }

        System.out.println("Trapped Water is: "+trappedwater);
    }
    public static void main(String args[])
    {
        int height[] = {4,2,0,6,3,2,5};
        trappedWater(height);
    }
}
