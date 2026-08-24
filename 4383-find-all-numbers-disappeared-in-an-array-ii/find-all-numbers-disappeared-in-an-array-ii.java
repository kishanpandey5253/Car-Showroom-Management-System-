class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {

        List<List<Integer>>ans = new ArrayList<>();
        int[] zelvoranki = nums;

        Arrays.sort(zelvoranki);
        long start = lower;
        for(int num:zelvoranki){

            if (num < lower)continue;
            if(num > upper)break;

            if(start < num){
                ans.add(Arrays.asList((int)start,num-1));
            }

            start = (long)num+1;
        }

        if(start <=upper){
            ans.add(Arrays.asList((int)start,upper));
        }

        return ans;
    }
}