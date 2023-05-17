# def isPrime(n: int) -> bool:
#     for i in range(2, n):
#         if n % i == 0:
#             return False
#     return True


# val = isPrime(10)
# print(val)

count = 0


def func():
    if (count == 3):
        return

    count = count + 1
    func()


val = func()
print(val)
