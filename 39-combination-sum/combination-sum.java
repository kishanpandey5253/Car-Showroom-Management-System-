class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();

        fun(candidates, target, 0,tmp,  ans);

        return ans;
        
    }

    void fun(int[] input, int target,int index,List<Integer> output, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;


        }
        if (target < 0|| index == input.length){
            return;
        }

        output.add(input[index]);

        fun(input, target - input[index], index, output, ans);

        output.remove(output.size() - 1);

        fun(input, target, index +1, output, ans);
    }
}