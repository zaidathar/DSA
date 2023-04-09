class Solution:
    def largestPathValue(self, colors: str, edges: List[List[int]]) -> int:
        
        n = len(colors)
        graph = defaultdict(list)
        inDegree = defaultdict(int)

        for u, v in edges:
            graph[u].append(v)
            inDegree[v] += 1
        
        q =  [] 
        dp =[[0] *26 for i in range(n)]
        color = [ ord(_) - ord('a') for _ in colors]

        for u in range(n):
            if u not in inDegree:
                q.append(u)
                dp[u][color[u]] = 1

        visited = 0
        
        while q :
            u = q.pop()
            visited += 1
            for v in graph[u]:
                for c in range(26):
                    dp[v][c] = max(dp[v][c], dp[u][c] + ( c == color[v]))
                inDegree[v] -= 1

                if inDegree[v] == 0:
                    q.append(v)
                    del inDegree[v]
        if visited < n:
            return -1 ;

        return max(max(x) for x in dp)

