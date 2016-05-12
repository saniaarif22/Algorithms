public class FactZeros {
    public int trailingZeroes(int n) 
    {
        //Basicalling count the number of '5' factors encountered since 10 is made by factor of 5 x factor of 2
        if(n==0) return 0;
        return n/5 + trailingZeroes(n/5);
    }
}
