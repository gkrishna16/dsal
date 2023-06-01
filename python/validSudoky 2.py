class Solution:
    def __init__(self):
        self.solution = []

    def validSudoku(self, board):
        mySet = set()

        for i in range(len(board)):
            for j in range(len(board[0])):
                num = board[i][j]
                if num == ".":
                    continue
                boxM = 3 * (i//3 + j//3)
                row = f"row : {i}, value : {num}"
                col = f"col : {j}, value : {num}"
                box = f"box : {boxM}, value : {num}"

                if row in mySet or col in mySet or box in mySet:
                    return False
                mySet.add(row)
                mySet.add(col)
                mySet.add(box)
        return True


sol = Solution()
val = sol.validSudoku([["5", "3", ".", ".", "7", ".", ".", ".", "."], ["6", ".", ".", "1", "9", "5", ".", ".", "."], [".", "9", "8", ".", ".", ".", ".", "6", "."], ["8", ".", ".", ".", "6", ".", ".", ".", "3"], [
    "4", ".", ".", "8", ".", "3", ".", ".", "1"], ["7", ".", ".", ".", "2", ".", ".", ".", "6"], [".", "6", ".", ".", ".", ".", "2", "8", "."], [".", ".", ".", "4", "1", "9", ".", ".", "5"], [".", ".", ".", ".", "8", ".", ".", "7", "9"]])

print(val)
