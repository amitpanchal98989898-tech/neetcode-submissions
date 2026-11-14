class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        //sab element ki frequency nikalega
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        //sari hashmap ki entries ko list mai dale jise sort kar sake
        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(freq.entrySet());

        //sare list mai entry hai use descending mai sort karenge
        //jise hum k se top frequency vale nikal sake
        entries.sort((a,b) -> b.getValue() - a.getValue());

        //ab new Array banayenge jismai top k frequency vale hi store honge
        int ans[] = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = entries.get(i).getKey();
        }
        return ans;
    }
}
