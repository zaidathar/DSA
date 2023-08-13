package Chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1_01_Is_Unique {
     /*

    Statement : Implement algorithm to determine string had all unique character.


    Approach 1 :
        corner case:
            If length of string is greater than 26 ( considering only alphabet ignoring case )
            then return false as it always contains duplicate. If alphanumeric string with
            special character then we need not check this case.

        Will converting string to charArray then sort it, if two adjacent char are
        same in array then non-unique character string found.
        Time Complexity : O(N log N )
        Space Complexity : O ( N ) for character array

    Approach 2:
        Storing count of each character if greater than 1 means duplicate found

        Time Complexity : O (N)
        Space Complexity : O (N) for map  

    

    */

    public static Boolean isUniqueCharsApproach1(String str){
        char[] charArr = str.toCharArray();
        int len = str.length();
        Arrays.sort(charArr);
        for(int i= 1 ; i < len ;i++){
            if(charArr[i] == charArr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static Boolean isUniqueCharsApproach2(String str){
        Map<Character, Integer> mp = new HashMap<>();
        int len = str.length();
        for(int i=0 ;i<len ;i++){
            mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1);
        }
        
        for(Map.Entry<Character , Integer> me : mp.entrySet()){
            if(me.getValue() > 1)return false;
        }
        return true;
    }

    public static boolean isUniqueCharsApproach3(String str){
        if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
    }

    public static boolean isUniqueCharsApproach4(String str){
        if (str.length() > 26) { // Only 26 characters
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
            System.out.println("Checker "+checker+" "+((1 << val)));
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
    }


    public static void main(String[] args) {
        String s = "asdfhgjklwqertyuioa";
        System.out.println(isUniqueCharsApproach3(s));
    }
}
