class Solution:
    def simplifyPath(self, path: str) -> str:
        sp = path.split("/")
        res = ""
        stack = [] 
        for i in sp:
            
            if i=="" or i == ".":
                continue
            elif i == "..":
                if len(stack) > 0 :
                    stack.pop()
            else:
                stack.append(i)
        
        for i in stack:
            res = res+"/"+i
        if len(res) == 0:
            return "/"
        return res
