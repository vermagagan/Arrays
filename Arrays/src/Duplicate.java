//TIME COMPLEXITY ----> O(n)
import java.util.HashSet;
public class Duplicate
{
    public static boolean checkduplicate(int num[])
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<num.length; i++)
        {
            if(hs.contains(num[i]))
                return true;
            else
                hs.add(num[i]);
        }
        return false;
    }
    public static void main(String[] args)
    {
        int num[] = {1,2,3,1};
        System.out.println(checkduplicate(num));
    }
}
