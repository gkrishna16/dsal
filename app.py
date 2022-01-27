def largestWord(s):
  
    # Sort the words in increasing
    # order of their lengths
    s = sorted(s, key = len)
  
    # Print last word
    print(s[-1])