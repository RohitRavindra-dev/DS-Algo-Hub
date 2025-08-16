import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> seens = new HashSet<>();

        for (int i : nums) {
            if (seens.contains(i)) {
                return true;
            }
            seens.add(i);
        }

        return false;
    }

    public static void main(String[] args) {
        Solution mySolution = new Solution();
        System.out.println(mySolution.hasDuplicate(new int[] { 1, 2, 3, 4 })); // Output: false
        System.out.println(mySolution.hasDuplicate(new int[] { 1, 2, 3, 1 })); // Output: true
    }
}
