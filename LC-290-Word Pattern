class Solution:
    def wordPattern(self, a: str, s: str) -> bool:
        h=list(set(s.split()))
        g=list(set(list(a)))
        if(len(h)!=len(g)):
            return False
        s=s.split()
        if(len(a)!=len(s)):
            return False
        d={}
        for i in range(len(a)):
            if(a[i] in d):
                if(d.get(a[i])==s[i]):
                    continue
                else:
                    return False
            else:
                d[a[i]]=s[i]
        return True
