m=bin(a)[2:]
        n=bin(b)[2:]
        o=bin(c)[2:]
        x = len(m)-1
        y = len(n)-1
        z = len(o)-1
        maxi = max(x+1,y+1,z+1)
        if(len(m)<maxi):
            m='0'*(maxi-len(m))+m
        if(len(n)<maxi):
            n='0'*(maxi-len(n))+n
        if(len(o)<maxi):
            o='0'*(maxi-len(o))+o

        count=0
        for i in range(maxi):
            if(o[i]=='1'):
                if(m[i]=='0' and n[i]=='0'):
                    count+=1
            else:
                if(m[i]=='1'):
                    count+=1 
                if(n[i]=='1'):
                    count+=1
        return count;
