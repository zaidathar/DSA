class Solution:
    def isValid(self, s: str) -> bool:
        f = ['(','[','{']
        b = [')',']','}']
        stack = []

        for i in s :
            if i in f:
                stack.append(i)
            else:
                if len(stack) == 0: return False
                top = stack[len(stack)-1]
                if f.index(top) == b.index(i):
                    stack.pop()
                else:
                    return False
        if len(stack) > 0: return False
        return True
