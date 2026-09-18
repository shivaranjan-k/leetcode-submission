class Solution(object):
    def subsets(self, nums):
        res = [[]]
        for num in nums:
            new = []
            for curr in res:
                new.append(curr + [num])
            res.extend(new)
        return res
        