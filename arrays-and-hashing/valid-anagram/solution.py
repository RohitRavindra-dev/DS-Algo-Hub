class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        if(len(s)!=len(t)):
            return False

        c0 = ord('a')
        charMap = [0]*26 
        
        for i,j in zip(s,t):
            charMap[ord(i)-c0]+=1
            charMap[ord(j)-c0]-=1
            
        
        for i in charMap:
            if i:
                return False
            
        return True
        
solution = Solution()
print(solution.isAnagram("racecar", "carrace"))  # Output: True
print(solution.isAnagram("jar", "jam"))          # Output: False    
print(solution.isAnagram("anagram", "afa"))  # Output: False
print(solution.isAnagram("anagram", "nagaram"))  # Output: True