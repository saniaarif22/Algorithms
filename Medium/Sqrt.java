//Program to calculate the square root of a number without using math functions
public class Sqrt 
{
    public int mySqrt(int x) 
    {
        if (x == 0)
            return 0;
        int left = 1, right = x;
        while (true) 
        {
            int mid = left + (right - left)/2;
            
            if (mid > x/mid) 
            {
                right = mid - 1;
            } 
            else 
            {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
}