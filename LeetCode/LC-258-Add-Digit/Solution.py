class Solution:
    def addDigit(num):
        while num > 9:
            s = str(num)
            temp = 0
            for i in s:
                temp += ord(i) - ord('0')
            num = temp

        return num
