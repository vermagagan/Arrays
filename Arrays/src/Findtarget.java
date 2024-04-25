//TIME COMPLEXITY ----> O(log n)
public class Findtarget
{
    public static int find(int num[], int sidx, int eidx, int target)
    {
        int start, end, mid;
        start = sidx;
        end = eidx;
        while(start < end)
        {
            mid = (int) (start+end)/2;
            if(target == num[mid])
                return mid;
            else if(target > num[mid])
                start++;
            else
                end--;
        }
        return -1;
    }
    public static void search(int num[], int target)
    {
        int l=0,r=0;
        for(int i=0; i<num.length-1; i++)
        {
            if(num[i] > num[i+1])
            {
                l = find(num, 0, i, target);
                r = find(num, i+1, num.length-1, target);
            }
        }
        if(l != -1 && r == -1)
            System.out.println(l);
        else if(r != -1 && l ==-1)
            System.out.println(r);
        else
            System.out.println("-1");
    }
    public static void main(String[] args)
    {
        int num[] = {4,5,6,7,0,1,2,3};
        search(num, 0);
    }
}
