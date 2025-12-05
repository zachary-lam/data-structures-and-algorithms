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
Note: The parameter passed to `remove_element` is the value of the element to be deleted, not the position of the element to be deleted.


## Passing Parameters
- Python supports keyword parameters, however, Java does not.
- If a numeric value is passed, the value is modified within the function, but does not replace the original value in the calling function. This also applies to Java. (*see [`function1`](passing-params.py)*)
- However, if a list is passed and an element within it is modified, the modification is visible in the calling function. This also applies to Java. (*see [`function2`](passing-params.py)*)
- In Python, if the number of elements in a list is modified in a function, the change is visible in the calling function. For Java, the changes are not visible in the calling method. (*see [`add_element`](PassingParams.java)*)
- In Java, if the size of an array in the calling method must be modified, the called method must return the modified array and the calling method must assign the modified array to the original array.

```
public static void main(String[] parms) {
    int[] my_list;
    my_list = new int[] {1,2,3,4,5};
    print_list(my_list);

    my_list = add_element(my_list, 200);
    print_list(my_list);
}

public static int[] add_element(int[] my_list, int element) {
    int[] new_list;

    new_list = new int[my_list.length+1];
    System.arraycopy(my_list, 0, new_list, 0, my_list.length);
    new_list[new_list.length-1] = element;
    my_list = new_list;
    print_list(my_list);
    return my_list;
}

public static void print_list(int[] my_list) {
    int i;

    for(i=0; i < my_list.length; i++) {
        System.out.print(my_list[i] + " ")
    }
    System.out.println();

}
```

Output:
```
1 2 3 4 5
1 2 3 4 5 200
1 2 3 4 5 200
```


## Scope
- In Python, variables used in a function are <u>**local**</u> to that function. When the function terminates, the variables are destroyed.
- If a variable in a calling function is required in the called function, the variable should be passed to the called function as a parameter.
- Python permits variables that are given values in the calling function to be accessed (but not modified) in the called function. However, this is not a standard programming construct.
- In Java, variables are local to the method in which they are declared.
- Java does not permit variables declared in one method to be accessed in a called method.
- In this case, the variable must be passed to the called method if the variable in a calling method is required to be used in said called method.

## Data Types
- Java is a collection of data types referred to as *primitive* (not objects).
- Variables in Java are given a specific type, unlike Python which does not require type declaration as they are dynamically typed.
- Data types in Java are converted using a *cast* mechanism. (*see [cast](DataTypes.java)*)

<table>
<tr>
<th>Python</th>
<th>Java</th>
<th>Meaning</th>
</tr>

<tr>
<td>int</td>
<td></td>
<td>integer of any size</td>
</tr>

<tr>
<td></td>
<td>byte</td>
<td>-128 <= integer <= 127</td>
</tr>

<tr>
<td></td>
<td>short</td>
<td>-32768 <= intenger <= 32767</td>
</tr>

<tr>
<td></td>
<td>int</td>
<td>-2147483648 <= intenger < 2147483647</td>
</tr>

<tr>
<td></td>
<td>long</td>
<td>approx. 18 digit integer</td>
</tr>

<tr>
<td></td>
<td>float</td>
<td>7 digit accuracy</td>
</tr>

<tr>
<td>float</td>
<td>double</td>
<td>15 digit accuracy</td>
</tr>

<tr>
<td>bool</td>
<td>boolean</td>
<td>true/false</td>
</tr>

<tr>
<td></td>
<td>char</td>
<td>one character</td>
</tr>
</table>


## Strings
- Strings essentially store a collection of characters.
- In Python, a subset of strings can be extracted using *slicing*. (*see [slicing](strings.py)*)
- The notation [*from*, *to*] means beginning with the character from and continuing up to (but not including) are to be extracted.
- [*from*] will extract only the one character.
- [*from*:] will extract characters beginning at and continuing until the end of the string.
- In Java, **char** stores only <u>**one**</u> character. To store more, you would need to declare a char[] (array).
- Like Python, Java can extract similarly to slicing, but using `substring`. (*see [`substring`](Strings.java)*)

## Determining Prime Numbers (combining it all together)
- This program determines the prime numbers that are less than `n`. A number is prime if it does not have any integer divisors > 1, other than itself.
- This program ties everything together, teaching basic control flow.
- It also acts as a small algorithm where correctness is easy to verify.

[Python Prime Numbers Program](prime-numbers.py)

[Java Prime Numbers Program](PrimeNumbers.java)