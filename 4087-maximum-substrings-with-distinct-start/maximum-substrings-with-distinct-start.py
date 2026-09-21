class Solution:
    def maxDistinct(self, s: str) -> int:
        seen = set()
        for i in s:
            seen.add(i)
        return len(seen)
        