class Solution {
    public int leastInterval(char[] tasks, int n) {
        int len = tasks.length;
        int[] charCount = new int[26];
        int max = 0, maxCharCnt = 0;

        for(char task : tasks) {
            charCount[task - 'A']++;
            if(max == charCount[task - 'A'])
                maxCharCnt++;
            
            else if(max < charCount[task - 'A']) {
                max = charCount[task - 'A'];
                maxCharCnt = 1;
            }
        }
        
        int partCount = max - 1;
        int partLength = n - (maxCharCnt - 1);
        int unusedSlot = partCount * partLength;
        int remainingTasks = len - max * maxCharCnt;
        int idles = Math.max(0, unusedSlot - remainingTasks);
        
        return len + idles;
        
    }
}
