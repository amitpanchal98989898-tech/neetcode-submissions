class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int num[] = new int[2];
        while(i<j){
            //Step 1 jab curr ke aage se i sath sum na mile tab tak i ++ 
            if(numbers[i] + numbers[j] > target){
                j--;
            } else if(numbers[i] + numbers[j] < target){
                i++;
            }else if(numbers[i] + numbers[j] == target){
                num[0] = i + 1;
                num[1] = j + 1;
                break;
            }           
        }
        return num;
    }
}
