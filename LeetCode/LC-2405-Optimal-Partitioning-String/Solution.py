class Solution:
    def partitionString(self, s: str) -> int:
        st = set()
        cnt = 1

        for i in s :
            if i in st:
                cnt+=1
                st.clear()
            st.add(i)
        return cnt