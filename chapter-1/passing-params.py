def function1(n):
    print(n)
    n += 1
    print(n)
    return


n = 10
function1(n)
print(n)


def function2(list):
    print(list)
    list[2] += 10
    print(list)
    return


list = [1, 2, 3, 4]
function2(list)  # list is updated by function call
print(list)
