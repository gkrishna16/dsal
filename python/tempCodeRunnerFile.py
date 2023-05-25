def decode(self, strn):
        res, i = [], 0

        while i < len(strn):
            j = i
            while strn[j] != '#':
                j = j + 1
            length = int(strn[j - 1])
            res.append(strn[j+1:j+1 + length])
            i = j + 1 + length
        return res