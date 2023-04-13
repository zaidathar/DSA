class Solution:
    def validateStackSequences(self, pushed: List[int], popped: List[int]) -> bool:
        p = 0
        stack = []
        for val in pushed:
            stack.append(val);

            while len(stack) and stack[-1] == popped[p]:
                stack.pop()
                p+=1
        
        return False if len(stack) else True
