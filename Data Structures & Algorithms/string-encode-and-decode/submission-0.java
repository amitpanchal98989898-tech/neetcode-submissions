class Solution {

    public String encode(List<String> strs) {
        //step 1
        //length nikaldvalni
        //format #length# banane ke liye StringBuilder use karna hoga
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<strs.size(); i++){
            //step 1 geting String
            String str = strs.get(i);
            //step 2 find length of String
            int length = str.length();
            //Step 3 Addition of String
            sb.append("#").append(length).append("#").append(str);
        }
        //ise normal String mai conver ho jata hai
        String encodedString = sb.toString();
        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        // step 1 finding length
        int i = 0;
        while(i < str.length()){
            int j = i + 1;
            while(str.charAt(j) != '#'){
                j++;
            }
            //len nikali
            int len = Integer.parseInt(str.substring(i+1, j));
            //step 2 ab list mai String katke add kiya length se
            res.add(str.substring(j+1, j+1+len));

            //i ki value update ki taki dusre itration mai hume dusri string nikal sake
            i = j+1+len;
        }
        return res;
    }
}
