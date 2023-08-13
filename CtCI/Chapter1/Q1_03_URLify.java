package Chapter1;

public class Q1_03_URLify {
    public static int findLastCharIndex(String s){
        for(int i = s.length()-1 ;i>=0;i--){
            if(s.charAt(i) != ' ')return i;
        }
        return -1;
    }
    public static String replaceSpaceApproach1(String s){
        int len = findLastCharIndex(s) + 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ;i<len; i++){
            char val = s.charAt(i);
            if(val == ' '){
                sb.append("%20");
            }
            else sb.append(val);
        }

        return sb.toString();
    }
    public static void replaceSpaceApproach2(char[] str){
        int spaceCount = 0, index, i = 0;
        int trueLength = findLastCharIndex(str.toString()) + 1;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;
		if (trueLength < str.length) str[trueLength] = '\0';
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}

    }
    public static void main(String[] args) {
        String url = "My name is Java ";
        char[] arr = url.toCharArray();
        replaceSpaceApproach2( arr);
        for(char c : arr)
            System.out.print(c);
    }
}
