public class TwoDMatrix 
{
    /* Algorithm to searhc a matrix of Integers that are sorted rowise from left to right.
    The first integer of each row is greater than the last integer of the previous row. */
    public boolean searchMatrix(int[][] matrix, int target) 
    {
            if (matrix == null || matrix.length == 0) //Base cases
                return false;
                
            int start = 0, rows = matrix.length, cols = matrix[0].length;
            int end = rows * cols - 1; //index of the last corner right element
            
            while (start <= end) 
            {
                int mid = (start + end) / 2;
                if (matrix[mid / cols][mid % cols] == target)
                    return true;
                    
                if (matrix[mid / cols][mid % cols] < target)
                    start = mid + 1;
                
                else
                    end = mid - 1;
            }
            return false;
    }
}