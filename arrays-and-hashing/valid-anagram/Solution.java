class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
            arr[t.charAt(i) - 'a'] -= 1;
        }

        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Solution mySolution = new Solution();
        System.out.println("anagram and nagaram: " + mySolution.isAnagram("anagram", "nagaram")); // Output: true
        System.out.println("rat and car: " + mySolution.isAnagram("rat", "car")); // Output: false
        System.out.println("listen and silent: " + mySolution.isAnagram("listen", "silent")); // Output: true
        System.out.println("hello and world: " + mySolution.isAnagram("hello", "world")); // Output: false
        System.out.println("adadfsf and adsffg: " + mySolution.isAnagram("adadfsf", "adsffg")); // Output: false
    }
}