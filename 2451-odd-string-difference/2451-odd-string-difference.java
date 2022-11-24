class Solution {
    public String oddString(String[] words) {
       Map<String,List<String>> m = new HashMap<>();
        for(String x : words){
            int n = x.length();
            String s = "";
            for(int i=1;i<n;i++){
                int diff = (x.charAt(i)-'a')-(x.charAt(i-1)-'a');
                s+=diff;
            }
            if(m.containsKey(s)){
                List<String> l = m.get(s);
                l.add(x);
                m.put(s,l);
            }else{
                List<String> l = new ArrayList<>();
                l.add(x);
                m.put(s,l);
            }
        }
        
        for(Map.Entry<String,List<String>> k : m.entrySet()){
            List<String> l = k.getValue();
            if(l.size()==1) return l.get(0);
        }
        
        return words[words.length-1];
    }
}