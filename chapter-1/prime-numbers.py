def isPrime(value):
    result = True
    count = 2

    while (count < value) and (result):
        if ((value // count) * count) == value:
            result = False
        count += 1
    return result


def generatePrimes(n):
    list = []
    for i in range(2, n):
        if isPrime(i):
            list.append(i)
    return list


list = generatePrimes(40)
print(list)
