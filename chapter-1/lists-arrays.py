def print_list(my_list):
    # get the total length of the list
    for i in range(0, len(my_list)):
        print(my_list[i], end=" ")  # print the value of the list at index[i]
    print()
    return


my_list = [1, 2, 3, 4]  # list (a collection type)
print_list(my_list)


def print_list(my_list):
    for i in my_list:
        print(i, end=" ")
    print()
    return


# This function will return a specified list of values from 0, to n-1.
def create_list(n):
    my_list = []  # empty list
    for i in range(0, n):
        my_list.append(i)  # appends values (i) to the empty list up to n-1
    return my_list


my_list = create_list(5)
print_list(my_list)


def max_list(my_list):
    max = my_list[0]
    for i in my_list:
        if i > max:
            max = i
    return max
