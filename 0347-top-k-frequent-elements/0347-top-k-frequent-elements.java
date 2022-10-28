class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i =0; i<nums.length; i++)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        // Create a list from elements of HashMap
ArrayList<Map.Entry<Integer, Integer> > list= new ArrayList<>(hm.entrySet());
       
 Collections.sort(
            list,
            new Comparator<Map.Entry<Integer, Integer> >() {
                public int compare(
                    Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2)
                {
                    if (o1.getValue() == o2.getValue())
                        return o2.getKey() - o1.getKey();
                    else
                        return o2.getValue()
                            - o1.getValue();
                }
            });
int[] res=new int[k];
         for (int i = 0; i < k; i++)
           res[i]=list.get(i).getKey();
        
        return res;
    }
}