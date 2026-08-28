class Solution {

    void combination(int[] candidates, int target, int i, List<Integer> output, List<List<Integer>> ans){

        if (target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }

        if(target < 0||i == candidates.length){
            return;
        }

        for(int j = i; j< candidates.length; j++){

            if (j > i && candidates[j] == candidates[j-1]) {
                continue;
            }
            
            if (candidates[j]> target){
                break;
            } 
            output.add(candidates[j]);
            
            combination(candidates, target-candidates[j], j+1, output, ans);
            
            output.remove(output.size()-1);      
         }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        combination(candidates, target, 0, output,ans);

        return ans;
    }
}