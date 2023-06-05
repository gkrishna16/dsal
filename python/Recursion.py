def Recur(n):
    if n == 0:
        return 1
    else:
        return n * Recur(n - 1)


def printNums(n):
    if n < 0:
        return
    print(n)
    printNums(n - 1)
    print(n - 2)


def Factorial(n):
    print(f"I am calculating F {n}")
    if n == 0:
        return 1
    F = n * Factorial(n - 1)
    print(f"Done ! F{n} = {F}")
    return F


def addition(n: int):
    print(f"I am clculating F {n}")
    if n == 0:
        return 0
    A = n + addition(n-1)
    print(f"Untill now -- {A}.")
    return A


add = addition(5)
print(add)
