class Solution {

     void fun(List<Integer> nums, List<Integer> tmp, List<List<Integer>> ans) {

        if (nums.size() == 0) {
            ans.add(new ArrayList<>(tmp));
            return;
        }
        for (int i=0 ; i< nums.size() ; i++){

         List<Integer> ip = new ArrayList<>(nums);
         List<Integer> op = new ArrayList<>(tmp);

         op.add(nums.get(i));

         ip.remove(i);

         fun(ip , op, ans);

    }
}

public List<List<Integer>> permute(int[] nums) {

    List<Integer> list = new ArrayList<>();
    List<Integer> tmp = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

     for (int num : nums) {
            list.add(num);
        }

        fun(list, tmp, ans);
        return ans;
}
    

}

