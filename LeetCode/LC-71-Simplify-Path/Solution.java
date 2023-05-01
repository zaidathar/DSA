class Solution {
    public String simplifyPath(String path) {
        String[] sp = path.split("/");
        List<String> list = new ArrayList<String>();

        for(String s : sp){
            if(s.equals("") | s.equals("."))continue;
            else if(s.equals("..")){
                if(list.size() > 0){
                    list.remove(list.size()-1);
                }
            }
            else{
                list.add(s);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(String s : list){
            sb.append("/");
            sb.append(s);
        }

        if(sb.length() == 0) return "/";

        return sb.toString();
    }
}
