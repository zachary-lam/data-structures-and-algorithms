# Procedural Programming: Chapter 1 Notes

**SIDE NOTE**
MacOS comes equipped with Python3 so Code Runner currently won't work unless value is changed to `python3 -u`

To point Python to Python3, use this in the terminal:

```
echo 'alias python="python3"' >> ~/.zshrc
source ~/.zshrc
```

## Programming
- Procecural programming is the practice of using basic constructs to build programs with no Objects.
- A program is essentially a collection of statements made from a specified programming language.
- Statements are executed sequentially unless control structures are used (which change the arrangement in which statements are executed).


## Hello World
The Hello World program acts as a starting point to ensure the necessary infrastructure (compiler, paths to libraries, etc) are set up correctly. 

Java
```
public static void main (String[] parms) {
    System.out.println("Hello World!)
}
```

- While the method above prints the same exact statement as the [Python](hello-world.py) program, this is not a complete program, unlike its Python counterpart. Java methods <u>**must**</u> be defined within a Class before they can be compiled and executed as shown in [HelloWorld.java](HelloWorld.java).
- The name of the class must match the name of the file. 
- Java compiles the program and then executes it as a 2-step process.
- The [class](HelloWorld.class) file is used when the program is executed.


## Loops
- If a loop may terminate before all the values in the `for` statement are exahsuted, the loop must be written using a `while` statement. Essentially, a loop should have one entry point and one exit point.
- Therefore using a `break` statement is poor progamming practice.


## Functions
- In Java, functions = methods. 
- When a function doesn't return a value, it is considered a "void function".
- Void functions don't require a return statement.
- A void method in Java is the same as a Python void function and the same rules apply.

## Lists/Arrays
- An array is a programming construct that stores a **collection** of values.
- In Python, it's referred to as a *collection* and there are different types.
- Python lists are zero-based (first element is indexed at [0]).
- Often referred to as `i`, the variable is used as a *subscript*, that specifies the position of an element in a list tto be accessed.

An alternative to the [Python](lists-arrays.py) function with a modified for loop:
```
def print_list(my_list):
    for i in my_list:
        print(i, end= " ")
    print()
    return
```

This makes list manipulation easier. `i` is assigned one value from the list each time through the loop. `i` is no longer a subscript in this case, as `i` contains an element of the list.

- In Python, a list is a <u>**dynamic**</u> structure that is created as an empty list and then elements are added.
- In Java, anarray is a <u>**static**</u> structure where it is given an initial size and the size can't be modified.
- The values can be changed by accessing the index and re-assigning the variable at the given index a different value, but the size of the array is still of size `n` for a Java array and therefore, cannot add new values that exceed the size of `n`.
- Python has built-in methods to manipulate lists, but Java requires custom methods to be made in order to do so. 

```
public static int[] remove_element(int[] list, int element) {
    int[] new_list;
    int position;
    int i;

    position = -1;
    for (i=0; i<list.length; i++) {
        if (list[i] == element) {
            position = i;
        }
    }
    if (position == -1) {
        new_list = list; // element not found, return og list
    } else {
        new_list = new int[list.length-1];
        System.arraycopy(list, 0, new_list, 0, position);
        System.arraycopy(list, position+1, new_list, position, new_list.length-position)
        return new_list
    }
}
```