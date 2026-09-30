class Solution:
    def convert(self, s: str, numRows: int) -> str:

        if numRows == 1 or len(s) <= numRows:
            return s
        
        idx,d = 0,1

        rows = [[] for _ in range(numRows)]

        for ch in s:
            rows[idx].append(ch)
            
            if idx == 0:
                d = 1
            elif idx == numRows - 1:
                d = -1
            idx += d
        
        return "".join("".join(row) for row in rows)