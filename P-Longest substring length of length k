String s="abcdebabbbaed";
        int k=3;
        int ws=0;
        int maxlength=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int we=0;we<s.length();we++){
            Character ch=s.charAt(we);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.size()>k){
                Character left=s.charAt(ws);
                hm.put(left,hm.get(ch)-1);
                if(hm.get(left)==0){
                    hm.remove(left);
                }
                ws++;
            }
            maxlength=Math.max(maxlength,we-ws+1);

        }
        
        System.out.println(maxlength);
        }
    }
