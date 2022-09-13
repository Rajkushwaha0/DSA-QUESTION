class Solution:
    def decodeMessage(self, s: str,v: str) -> str:
        d={}
        k=97
        for i in range(len(s)):
            if(s[i] in d or s[i]==" "):
                continue
            else:
                d[s[i]]=chr(k)
                k+=1
        res=""
        for i in range(len(v)):
            if(v[i]==" "):
                res+=" "
            else:

                res+=d[v[i]]
        return (res)
