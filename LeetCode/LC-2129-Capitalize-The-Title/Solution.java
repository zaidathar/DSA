class Solution {
    public String lowerCase(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i <s.length();i++){
            if(s.charAt(i)-'a' < 0){
                sb.append((char)(s.charAt(i)+32));
            }
            else sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
    
    public String capitalize(String s){
        char first = s.charAt(0) - 'a' >= 0 ? (char)(s.charAt(0)-32) : s.charAt(0);
        return first+lowerCase(s.substring(1,s.length()));
    }
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        for(int i = 0;i<arr.length;i++){
            if(arr[i].length() < 3){
                arr[i] = lowerCase(arr[i]);
            }
            else{
                arr[i] = capitalize(arr[i]);
            }
        }
        
        return String.join(" ",arr);
    }
}
