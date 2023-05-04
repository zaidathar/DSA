class Solution:
    def predictPartyVictory(self, senate: str) -> str:
        r_queue , d_queue = [],[]
        size = len(senate)
        for i in range(len(senate)):
            if senate[i]=='D':d_queue.append(i)
            else:r_queue.append(i)
        
        while len(r_queue)!= 0 and len(d_queue)!=0:
            size+=1
            if r_queue.pop(0) < d_queue.pop(0):
                r_queue.append(size)
            else:
                d_queue.append(size)
            
        return "Radiant" if len(r_queue) > 0 else "Dire"