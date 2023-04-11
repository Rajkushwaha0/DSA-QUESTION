class Solution:
    def isCircularSentence(self, s: str) -> bool:
        l = s.split()
        k = l[0][len(l[0])-1]
        s=k
        for i in range(1,len(l)):
            m = l[i][0]
            print(m,s)
            if(m!=s):
                return False
            s = l[i][len(l[i])-1]
        if(s!=l[0][0]):
            return False
        return True
