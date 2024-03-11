class SlowSolution {
    public String customSortString(String order, String s) {
        int[] charCount = new int[26];
        int[] track = new int[26];
        SortedSet<List<Integer>> prioritySet = new TreeSet<>((o1, o2) -> Integer.compare(o1.get(0), o2.get(0)));
        int priority = 0;
        for(char c : order.toCharArray()){
            int ind = c - 'a';
            List<Integer> temp =  Arrays.asList(priority, ind);
            prioritySet.add(temp);
            priority++;
            track[ind] = 1;
        }
        
        for(char c : s.toCharArray()){
            int ind = c - 'a';
            charCount[ind]++;
            if(charCount[ind] > 1)continue;
            if(track[ind] > 0)continue;
            List<Integer> temp =  Arrays.asList(priority, ind);
            prioritySet.add(temp);
            priority++;
            track[ind]=1;
        }

        StringBuilder sb = new StringBuilder();
        for(List<Integer> ls : prioritySet){
            int ind = ls.get(1);
            int cnt = charCount[ind];
            while(cnt > 0){
                cnt--;
                char c = (char)('a' + ind);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
