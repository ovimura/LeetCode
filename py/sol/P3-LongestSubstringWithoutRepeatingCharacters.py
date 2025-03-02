
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_set = set()
        left = 0
        max_length = 0
        for right in range(len(s)):
            while s[right] in char_set:
                char_set.remove(s[left])
                left += 1
            char_set.add(s[right])
            max_length = max(max_length, right - left + 1)
        return max_length


s = Solution()

assert 3 == (s.lengthOfLongestSubstring('abcabcbb'))
assert 3 == (s.lengthOfLongestSubstring('abc'))
assert 3 == (s.lengthOfLongestSubstring(('abcb')))
