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


res = [-1] * 50
print(res)


def fib(n):
    if n <= 1:
        return n
    if res[n] != -1:
        return res[n]
    res[n] = fib(n-1) + fib(n-2)
    return res[n]


def fib2(n):
    if n <= 1:
        return n
    F1 = 0
    F2 = 1
    F = 0
    for i in range(2, n+1):
        F = F1 + F2
        F1 = F2
        F2 = F
    return F


def MdlrEcpntn():
    return


sol = fib2(10)
print(f"TS {sol}")
print(res)
