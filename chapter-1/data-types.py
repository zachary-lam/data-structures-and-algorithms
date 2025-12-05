i = 25
j = 25.5
print(type(i))
print(type(j))


# This function will clean up <class 'type'> and output just 'type'
def get_type(var):
    return var.__class__.__name__


print(get_type(i))
print(get_type(j))
