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