public class IsAnagram {
    public boolean isAnagram(String s, String t)
    {
        // A string is an anagram of another, if it has all the letters the string has, in a different order.
        
        /* Method 1:

        if(s.isEmpty())	return(t.isEmpty()); //Base Case
        
        if(s.length()!= t.length())	return false; //Base Case
        
        Set<Character> s1 = new HashSet();
        Set<Character> t1 = new HashSet();
        
        for(int i=0; i<s.length(); i++)
        {
        	s1.add(s.charAt(i));
        	t1.add(t.charAt(i));
        }
        
        return (s1.containsAll(t1) && t1.containsAll(s1)); */

        //Method 2:
        
        if(s.isEmpty())	 //Base case
            return(t.isEmpty());
        
        if(s.length()!= t.length())	 //Base case
            return false;
            
        char ch[] = new char [26];
        for(int i=0; i<s.length(); i++)
        {
            ch[s.charAt(i) - 'a']++;
            ch[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<ch.length; i++)
            if(ch[i]!=0) return false;
        return true;
        
    }
}
