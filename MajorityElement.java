public class Solution
{
    public int majorityElement(int[] num) //http://www.cs.utexas.edu/~moore/best-ideas/mjrty/index.html
    {
        int major=num[0];
        int count = 1;
        
        for(int i=1; i<num.length;i++)
        {
            if(count==0)
            {
                count++;
                major=num[i];
            }
            else if(major==num[i])
                count++;
            else
                count--;
        }
        return major;
    }
    //METHOD 2: Sort array & return middle element [if majority has to cross the middle]
}
