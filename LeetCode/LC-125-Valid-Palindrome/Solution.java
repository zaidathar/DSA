class Solution {
    public boolean isPalindromeUsingString(String str){ 
        // Time complexity is O(n) and Space Complexity is O(1)

        BiPredicate<Character, Character > isCharEqual = (a,b) -> Character.toLowerCase(a) == Character.toLowerCase(b);
        
        int front = 0 , back = str.length() - 1 ;

        while(front < back){
            if(!Character.isLetterOrDigit(str.charAt(front))){
                front++;
                continue;
            }

            if(!Character.isLetterOrDigit(str.charAt(back))){
                back--;
                continue;
            }

            if( !isCharEqual.test(str.charAt(front), str.charAt(back)))
                return false;

            front++;
            back--;

        }

        return true;
    }
    public boolean isPalindromeUsingStringBuilder(String str){
        // Time complexity is O(n) and Space Complexity is O(n)
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isLetterOrDigit(c))
                sb.append(Character.toLowerCase(c));
        }

        String s = sb.toString();

        int front = 0;
        int back = s.length() -1;

        while(front < back){
            System.out.println(s.charAt(front)  + " "+s.charAt(back) );
            if(s.charAt(front) != s.charAt(back))
                return false;
            front++;
            back--;
        }

        return true;
    }
    
    public boolean isPalindrome(String s) {
        // return isPalindromeUsingStringBuilder(s);
        return isPalindromeUsingString(s);
    }
}
