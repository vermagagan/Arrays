//TIME COMPLEXITY ---> O(n^3)

public class Triplets
{
    public static void triplets(int num[])
    {
        for(int i=0; i<num.length; i++)
        {
            for(int j=i+1; j<num.length; j++)
            {
                for(int k=j+1; k<num.length; k++)
                {
                    if(num[i] != num[j] && num[j] != num[k] && num[k] != num[i] && num[i]+num[j]+num[k] == 0)
                        System.out.println("["+num[i]+","+num[j]+","+num[k]+"]");
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int num [] = {-1,0,1,2,-1,-4};
        triplets(num);
    }
}