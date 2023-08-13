package Chapter1;

public class Q1_04_Palindrome_Permutation {
    /**
     *
     * @Author Zaid Athar
     *
     * Walkthrough
     * - Is String is case-sensitive ?
     * - Is Spaces are counted as character and play role in Palindrome ?
     * - String is ASCII string ?
     *
     * Approach
     *  - For permutation string should be same from front and back
     *  - all character count should be even or at most 1 character count can be odd.
     *  -
     */
    public static boolean checkPalindromePermutation(String str){
        // safer side I can convert string to lowerCase
        str = str.toLowerCase();
        int[] track = new int[26]; // assuming string is case-insensitive

        // assuming no spaces are there
        for(char c : str.toCharArray()){
            if(c - 'a' >= 0 && c - 'z' <= 25){
                track[c - 'a']++;
            }
        }
        int oddCount = 0;
        for(int i = 0 ;i<26 ; i++){
            if(track[i]!=-1 && track[i]%2 !=0) {
                if(oddCount > 0)
                    return false;
                oddCount++;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String str = "Tact Coa";
        System.out.println("Is string is permutation of palindrome "+checkPalindromePermutation(str));
    }
}
