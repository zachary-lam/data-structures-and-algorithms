# for loop
print("For loop:")
for i in range(0, 5):
    print(i)

print()

# while loop
print("While loop:")
i = 0
while i < 5:
    print(i)
    i += 1

print()


# while loop where n is a multiple of 20
print("While loop where n is a multiple of 20:")
n = 25
i = n
stop = 0
while (i < 50) and (stop == 0):
    print(i, end=" ")

    if ((i // 20) * 20) == 1:  # // is truncated division 1.25 = 1
        stop = 1
    i += 1
print()
