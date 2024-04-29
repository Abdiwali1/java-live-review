
# Java Cheat Sheet

---
### This document will highlight the main points of the topics we cover.

## Table of Contents:
    Click to go directly to the section
---
[Shortcuts](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#shortcuts)

[Introduction to Programming](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#introduction-to-programming)

[IntelliJ](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#intellij)

[Java Basics](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#intellij)

[Variables](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#variables)

[Operators](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#operators)

[Conditional Statements](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#variables)

[Scanner](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#scanner)

[String](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#string)

[Methods](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#methods)

[Loops](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#loops)

[Array](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#loops)

[Custom Classes](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#loops)

[Wrapper Classes](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#wrapper-classes)

[ArrayList](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#arraylist)

[Constructor](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#constructor)

[Static](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#static)

[Access Modifier](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#access-modifiers)

[Encapsulation](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#encapsulation)

[Inheritance](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#inheritance)

[Method Overriding](https://github.com/Cydeo-SD-US034/java-live-review?tab=readme-ov-file#method-overriding)

---
## Shortcuts
```
copy: command/control + c
paste: command/control + v
cut: command/control + x
undo: command/control + z
save: command/control + s

screenshot:
    mac: command + shift + 5
    windows: windows key + shift + s
	
main method: main
print statement: sout
print for variable: soutv
	
comments
    select line/s that you want to comment then use the shortcut
        windows: control + /
        mac: command + /
			
reformat code:
    mac: option + command + l
    windows: control + alt + l
    
search for anything in IntelliJ
    shift + shift
        
search text inside of the files:
    command/control + shift + f
        
generate menu
    command/control + n
    
```

---

## Introduction to Programming

* computers understand binary. A language of 0s and 1s

```
   Ex: 
        00000000 -> 0
        00000100 -> 4
        10000000 -> 128
        11111111 -> 255
```

* In order to represent all characters in a computer there needs to be some way to represent characters in binary. This is done by a system that correlates numbers to a character. The number for a character can be converted to binary for the computer to process it.

* Unicode is global standard for these number/character correlations. There are different encoding formats that determine which character is related to which number. One common encoding used is UTF-8, which is equivalent to ASCII (American Standard Code for Information Interchange)

```
    Ex:
      Character <-> Number
          A     <->   65
          Z     <->   90
          a     <->   97
          z     <->   122
          !     <->   33
          *     <->   42 
```

* Programmers use programming languages, so they don't need to write in binary. High level languages, like Java, help a programmer write human understandable code that can later be compiled to a lower level language for the computer to understand.

* A java program is written in a .java file. That file is compiled into a bytecode file that has the .class extension. Bytecode files are run in the JVM. The JVM interprets the bytecode as it is run.
    * JVM: Java virtual machine that allows java programs to run

---

## IntelliJ

* IntelliJ is an IDE(Integrated Development Environment) that helps us write java code
    * We could write, compile and execute java files without an IDE, but it would make the whole process more time-consuming. IDEs make it easier by offering many shortcuts, hints, and warnings. They also allow us to compile and execute programs with a click of a button.

### Workflow in IntelliJ
    - The projects we work in a just folder being read by IntelliJ
    - The project has a source/root folder called src
    - We created packages in the src. Packages are folders that will help organized java files
    - In the packages we create java classes, java files to write java code

---

## Java Basics

### Java classes: In a java file there is a class defined. The class has the same name as the java file.

  ``` java
  public class HelloWorld {
  
  }
  ```

### Main method: How we can run java code.
  ``` java
  public static void main(String [] args) {
  
  }
  ```

### Print statement: Used to print information to the console
  ```
    System.out.println();
  ```

#### First program to display `Hello World` to the console
  ```java
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
  ```
---

### Comments
#### Comments allow regular text to be written in a java file. Comments are helpful to explain how the code works for others and for your future self
```java
  
// single line comments can create a comment on one line using two forward slashes

/*
multi line comments are declared with slightly different syntax and allow you to type comments on multiple lines
 */

/**
 * The java doc comments help to create documentation from the java code written. 
 * We will not need to use this comment, but we will see it used in official documentation and files
 */


```
### Escape Sequences
#### When you want to represent a character as a String that is also used in java syntax the backslash can be used to differentiate syntax between the character. breaking the line is also useful
```
Commonly uses:
  \n -> goes to next line
  \t -> adds a tab
  \\ -> adds a backslash character
  \" -> adds a double quotation character
```
___

## Variables
#### A variable is a way to define information into a reusable container. Variables in java are created by defining a data type and a name. After declaring a variable it can be assigned a value and used as many times as needed

```
  Syntax:
      datatype variableName = value;
  Ex: 
      int num = 100;
```

#### It is possible to declare variables to get them ready to be used and then later assign them. It is also possible to declare and assign variables at the same time. Both approaches are used. It is also possible to declare/assign multiple variables that share the same datatype by using a comma to separate the variables
``` 
  declaring
    int a;
    
  assigning
    a = 1;
    
  declaring & assigning
    int b = 130;
    
  declaring multiple
    byte a1, a2, a3;
    
  declaring & assigning multiple
    short s1 = 5, s2 = 10, s3 = 15;
  
```

### Data types
#### Java has two kinds of datatype: primitive datatype and non-primitive types(Object notes will be further down)

```
Primitive datatypes:
    byte
    short
    int 
    long
    float
    double
    char
    boolean
```
#### `byte`, `short`, `int`, and `long` are used to hold whole numbers. They differ in the amount of memory they use, and as a result how big of a number can be held. `int` is the most commonly used type, and it is also the default for whole numbers for the compiler
#### `float` and `double` are used to hold floating numbers. `double` is the most commonly used type, and it is also the default for floating(decimal) numbers for the compiler
#### `char` is used to hold a single character. The single quote ' ' is used to hold these characters
#### `boolean` can have a value of `true` or `false`

#### `String` is an object type. It is used to hold sequences of characters using double quotations " "

#### Concatenation (+) is used to combine two pieces of information together. At least one of the information being combined must be a String. The result of the concatenation is a String.
  ```
    Ex:
      String a = "hello"
      System.out.println(5 + a + 10); -> results in 5hello10
  ```

#### Primitive type casting: Converting from one primitive datatype to another

> Order from the smallest type to the biggest type: byte -> short -> int -> long -> float -> double

- Widening Convention is when you go from a smaller datatype to a bigger datatype. This direction is done automatically and does not require additional code
  ```
  Ex:
    int i = 5;
    double d = i;
  ```
- Narrowing Convention is when you go from a bigger datatype to a smaller datatype. This direction requires manually casting the types to the smaller type. Casting is done with the smaller datatype in parentheses

> General syntax for casting:
>>smallerType varName = (smallerType) biggerType

```
    Ex:
      double a = 9.99;
      int b = (int)a;
``` 

- Casting from a bigger datatype to a smaller datatype has the possibility for data loss. If a datatype cannot hold the value being assigned to it, there will be a calculation run to represent how much data was lost. When casting floating number to whole numbers the floating numbers are also lost. No rounding to the numbers is done

---

## Operators

#### Arithmetic Operators
Operators used to perform arithmetic calculations
  ``` 
	+ addition
	- subtraction
	* multiplication
	/ division
	% remainder/modulus
  ```
- Arithmetic operations between two different datatype result in the biggest datatype between the two

- The result of arithmetic operations with short or byte are given as an int type

#### Shorthand operators:
Shorter syntax to use the arithmetic operators and update the value of the variable without having to manually reassign

  ``` 
    +=
    -=
    *=
    /=
    %=
  ```
```

  Ex:
    normal use:
    
      int a = 10;
      a = a + 4; // a would have a value of 14 because the original value of a is taken, 4 is added to it, and then the result is reassign back into the variable
      
    shorthand use:
    
      int b = 6;
      b += 6; // b would have a value of 12 after this line because 6 is added to the original value of the variable and that result is automatically stored into the variable. The variable updates

```

#### Unary operators:

  ```
    +       (plus) positive number
    -       (minus) negative number
    ++      incrementing, adding 1
    --      decrementing, subtracting 1
    
    Pre and Post operations:
    
        Given int num = 0;

        pre-increment: increments the value before it is used in the expression
                ++num

        pre-decrement: decrements the value before it is used in the expression
                --num

        post-increment: increments the value after it is used in the expression
                num++

        post-decrement: decrements the value after it is used in the expression
                num--

    **** We will primarily use post incrementing

  ```

#### Relational Operators
used to compare values. The result is a boolean value
```
  > greater than
  >= greater than or equal to
  < less than
  <= less than or equal to
  == equals: checks if two values are the same
  != not equals: checks if two values are not the same
```
> Q: What is the difference between `=` and `==`
>> we use the `=` as the assignment operator
>
>>we use the `==` to compare the values to check if they are equal

#### Logical Operators
used to compare booleans. The result of a boolean value

```
  && and --> both boolean statements must be true for an and expression to be true
  || or --> at least one boolean statement must be true for the expression to be true
  ! not --> used to check the opposite value of a boolean
```

#### Overall precedence of operators
```
  Execution goes top to bottom. Left to right. Each operator in the same line is same priority so it executed left to right.
  
    ! + - ++ -- 
    * / %
    + -
    < > <= >= 
    == !=
    &&
    ||
    = += -= *= /= %=
```

---

# Conditional Statements

### If statements: Allow you to control how the program will be executed based on boolean expressions
Types of if statements:
- `single if`: boolean expression is checked. If the boolean is true the if block will be executed, but if the boolean is false the code will resume execution after the if statement

> has one boolean expression

    ```
    if(boolean_expression){
    
    }
    ```
- `if else`: boolean expression is checked. If the boolean is true the if block will be executed, but if the boolean is false the else block will be executed

> has one boolean expression

    ```
    if(boolean_expression){
    
    } else {
    
    }
    ```
- `multi branch`: boolean expression is checked. If the boolean is true the if block will be executed, but if the boolean is false the next boolean expression is checked and so on. Whenever a boolean is true that related block of code is executed

> has multiple boolean expressions

    ```
    if(boolean_expression){
    
    } else if(boolean_expression){
    
    } else {
    
    }
    ```
- `nested if`: if statement that is defined in another if statement.

  ```
  if(boolean_expression){
  
      if(boolean_expression){
  
      }
  
  } else {
  
  }
  ```

Note: If statements can be declared without any curly brackets. In those cases the first line after the statement is the block related to the if statement, but it is not readable and doesn't work when there is multiple lines that belong to one block, **so in general you should always use brackets**

### Ternary
alternative way to write `if` statements

syntax:
> returnValue = boolean_expression ? trueValue : falseValue

The `?` is treated as `if`

The `:` is treated as `else`

  ```
  Example:
    String s = 2 > 5 ? "Two" : "Five";
  ```
---

### Switch:
> A conditional statement that is useful when the possible values are known. Only useful for comparing exact values
>
> One of the key component of the switch in comparison to `if statements` is how execution of a switch is handled.
> Not all "conditions" or in this case "cases" are checked like they would be in an if statement. When the switch gets a value it will immateriality jump to the matching case and begin execution from that point top to bottom until the end of the switch or a `break`

```
syntax:
    switch(input value){
        case x:
            // statements
            break;
    }       
```

#### Keywords for switch:
- `case`: used to define the exact value that is being checked for and define the code that should be executed when the case is matched
    - valid input value types: byte, short, int, String, char
    - NOT valid types: double, float, boolean, long

- `default`: the case that is executed if no other case is matched. Acts similar to an else block for if statements. The default case is optional, but if a switch doesn't have a default and the value given is not defined then no case is executed. The default case can be anywhere in the switch. The order of the cases does not matter for matching

- `break`: stops the switch statement execution

#### Benefit of switch statements: readable, easy to maintain, generally quicker execution compared to a multibranch if statement

---
#### If statement vs Switch vs Ternary
	In most cases you will use if statements
	any switch or ternary can always be converted to an if statement
	If statements allow more flexibility by using single if, if else, multi branch, or nested 

	Switch is useful to compare the exact value, so it is a good choice when all the possible values are known (they will be the cases)
	Downsides: only compare values, no boolean logic, and the datatypes that can be compared are a little restrictive

	Ternary useful sometimes to make a quick single if statement in one line
	Can only be used when a value is returned, and you need to at least define two possible outputs

---

## Scanner

`Scanner` is a class that has methods to allow inputs of information from different sources. We will use the `Scanner` methods to type in the console to create some dynamic programs. In the future the dynamic aspect will come from what you are testing

1) To use `Scanner` we need to `import` the class
   > Importing allows a file to be used outside the package it was created in.

    Add the import line between the `package` and the `class`
    ```java
    import java.util.Scanner;
    ```

2) Create a `Scanner` object
    > creating an object will allow us to use the methods(code) that is already written to type in the console
    ```
     Syntax:
        Scanner input = new Scanner(System.in);
    ```
    - instead of `input` its possible to use any name, because it is just a name for the object. Common names are scan, keyboard, scanner, in
   
    > the name of the object is the reference (review classes and object)

3) Use the `Scanner` methods
   to use the methods we need to call them from the object:
    ```
    scannerObj.method();
    
    Scanner methods:
      nextByte()
      nextShort()
      nextInt()
      nextLong()
      nextFloat()
      nextDouble()
      nextBoolean()
      next(): returns a String, but only accepts one word
      nextLine(): returns a String, and can allow multiple words, but also accept the enter input
    ```
    
    > Known issue with nextLine():
    >
    > Since the nextLine() method accepts the enter inputs it can cause issues whenever trying to use it with the other Scanner methods. Whenever a different Scanner method, besides nextLine() is used before the nextLine call there is a problem because when typing in the console the enter key is used to submit the info and continue the program to the next line, but that enter input is also finishing the nextLine call without allowing you to type any for that call.
    >
    > The fix is to add an extra nextLine() call between the two Scanner methods

---

## String

- `String` is a class located in the `java.lang` `package`
    - the `java.lang` `package` is automatically imported because it has classes/files that are used regularly in java code

- `String` are `immutable`, which means after the object is created it cannot be changed

- Strings can be created in two ways:
    - `literal`: using double quotations | **The way we will usually create Strings**
      ```
          String s = "java";
      ```
      > String literals are created in the String pool which is a special memory location to handle the commonly used datatype. The String pool is located in the `heap`
    - using `new` keyword -- **we will talk about object creation more in the future**
      ```
          String s = new String("java")
      ```
      > objects created using `new` are created directly in the `heap` memory where all objects are created

Note: Do not use `==` to compare Strings. Strings are objects so the `==` compares the objects not the values

- Every character in a String has an `index`. Indexes start from 0. Indexes can be helpful with some methods to get certain characters. Whenever an index is used that does not exist the program will stop with : `StringIndexOutOfBoundsException`

#### String methods: methods are used to do some action with String objects. Use a method by calling the String `object.method()`

Return boolean
```
equals(): checks if two objects have the same characters. Does check for case sensitivity

equalsIgnoreCase(): checks if two objects have the same characters, but it will ignore the case sensitivity

startsWith(str): checks if the String object starts with the characters defined in the parenthesis

endsWith(str): checks if the String object ends with the characters defined in the parenthesis

contains(str): checks if the String object has the given characters defined in the parenthesis anywhere in the String

isEmpty(): checks if the String has no characters

isBlank(): checks if the String has only white space characters and no other characters
```
Return String
```
toUpperCase(): converts the characters all to uppercase

toLowerCase(): converts the character all to lowercase

trim(): removes any spaces from the beginning and end of the String

substring(): returns part of the String
    (int): the String returned will start from the index that was given in the parenthesis and keep every character until the end of the String
    (int, int): the String returned will start from the given index in the parenthesis and will include all the character up to the second given index number. Not including that ending index
    
replace(): allows you to modify/change a certain character/s to another given character/s. Replaces all of the occurrences of the character in the String    
    (char, char) first give the char you want change, second one is the char you are changing to   
    (String, String) first give the String you want change, second one is the String you are changing to   
    
replaceFirst(): replaces the first instance of the given String
    only works with Strings in the parenthesis     			
```
Return int
```
length(): checks how many characters are in the String

indexOf(): return an int(index) where the given character/s is located in the String. 
    If the character does not exist in the String -1 is returned
    (char): give a char in the parenthesis and it returns the index where that character is found. Only return the first occurrence of the character
    (String): give a String in the parenthesis it will look for that sequence of characters in the String and if its find that sequence it will return the index of the first character in the sequence
    (char/String, int):  give a String or a char, the value you are searching the index of, then you give a number which is the starting point to search from(starting point)
    
lastIndexOf(): returns an int(index) of the given parenthesis value, but the first occurrence of the value from the end of the String    
```
Return char
```
charAt(int): returns the character at the given index number from the parenthesis
```

Note: There is more methods, but we can not learn every single method created, there is many files, classes, libraries we will use that all have many useful methods. We need to get an idea of some common functions of Strings for now. For the full list of String methods check the oracle documentation: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html

---

## Methods

```
	being able to create a set of statements that have a function/action that are in some code block
		-> makes it reusable, maintainable, readable

	public static RETURN_TYPE methodName(){
	
	}	

	RETURN_TYPE: 2 type of methods:
		void - nothing is given back from the method
		return type - does an action and return a single value back
		
            if a method has a return type defined instead of the void, then there must be a return value. 
                -> The return value is given using the 'return' keyword in the method

            return method work with and without parameters
```

#### Parameters: defined variables that the method needs in order to execute, the information acts are input data
```
	those parameters are defined in the parenthesis of the method

	Note: if a method has a parameter a value must be given in order to execute that method
	Note: to put multiple parameters separate by comma
		(int a, int b)
		(String s, byte b)
		(int[] arr, int n)

	the argument is the value given when calling the method

	Ex:

		public static void letter(char c){

		}

		char c --> parameters

		letter('a') --> 'a' is the argument
```
#### How to call a method:
```

    - Assuming they are static methods for now

	in the same file: only need method name

	outside the file: className.method()

	-> Anytime you want to use anything from a different package you should import the class

		import packageName.className

		order in java file: PIC -> package -> import -> class
```

#### Method Overloading
```
	method has the same name, but different parameters
		-> allow us to have different methods that share a similar idea and work with different inputs
		+ readability
		+ re usability

	Ex from String class:
		substring(int)
		substring(int, int)	

		in this class we had two method that had the same name. They have a similar idea but the result can be different based on which argument were given

			if you give one int, choose starting point and returns all characters after that point
			if you give two int, it would return the characters in the range of those numbers
			
    Q: Does changing the return type overload the method?
        NO, changing the parameters is what overload the method
        -> but if you overload correctly, then it is possible to change the return type
```

---

# Loops

Used to execute the same statements multiple times

> Loop types:

    - while loop: evaluates a boolean expression to determine if the loop should iterate again
        - if the boolean expression is true: the statements in the loop body are executed
        - if the boolean expression is false: the loop stops

        while(boolean) {
            // statements
        }   

    - do while: one iteration of the statements is always guaranteed then the boolean expression is checked to determine if the loop continues or not
        - if the boolean expression is true: the loop repeats and code statements are executed again
        - if the boolean expression is false: the loop stops

		do {
                // statements
		} while(boolean);

    - for loop: used when the iterations are known. Useful loop type because of the ability to define the parts exactly how you need to use them. Has built in functions of how code is executed

        for(initialization; termination condition; update){
            // statements
        }
        
        flow of loop: variable from initialization part is created for the loop. This part only runs once. Then the boolean expression in the termination condition is checked. If the boolean is true the statement in the loop are executed. Finally to finish an iteration the update part is executed. From there the boolean expression is checked again and the cycle repeats until the boolean is false

> Note: When a loop's boolean expression will never change to false the loop will continue to execute making it an infinite loop.

> break & continue
>
>       break: stops and exits the loop
>
>       continue: skips the rest of the current iterations 

#### Nested loop
> A nested loop is a loop inside another loop.

```
Execution of a nested loop:
the outer loop executes one iteration at a time
but during each execution of the outer loop, the inner loop is executed from beginning to end each time
the inner loop starts and ends each iteration of the outer loop

    Example:
    
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 2; j++) {
            
            }   
        }
```
---

# Custom Classes

### What is a class

	a template/blueprint for objects.
	allows you to define information(variables) & actions(methods)
	-> both are instance members

### What is an object

	instance of a class, it has a copy of all the information and actions defined from the class

#### How to create an object

	ClassName varName = new ClassName();

	Note: left side of equal sign is the reference
		  right side of the equal sign is the object

	instantiation: creates an object	  

#### What is an instance variable

	variable defined in a class
	every object has a copy of these variables

#### How to print objects

	we cannot print directly because it will show some hashcode

	the toString method from the object class is inherited and this method is called when printing objects. If you want to change how the object is printed you must override the method. [See inheritance sections for more clarification ]

syntax:
```
public String toString(){
    return "information you to print"
}
```

#### this
java prioritizes local variables over instance variables

    if you have a local variable and an instance variable with the same name. The local variable will be the one used

	this keyword: acts as a reference to the object
	so it will normally be used to tell the compiler the difference between a local variable and an instance variable

	Ex:
    public class A{
        String str;
        public A(String str){
            this.str = str; // Note here
        }
    }
Note: this line will assign the argument as the value to the instance variable for that object. Without 'this' keyword, the local str from the parameter would be assigning to itself, doesn't change the instance variable

---

## Array
    storing multiple information of similar type to one object
    instead of using multiple variables we can use an array to group that information

#### Declaring array:

```	
declaring with values/elements

    dataType[] name = {element, elm, elm ,etc};
    String[] words = {"java", "testing", "Friday"};
```
```
declare an empty array - the array will have default values based on type

    dataType[] name = new datatType[size]
    String[] strs = new String[5];
    
    default values of different types:
        whole number: 0
        floating number: 0.0
        boolean: false
        object: null
```
### Access Elements
```
elements have an index, start from 0
arrayName[index] --> use this to read a value: use information from that array
```
### Changing/Reassigning Elements
```
arrayName[index] = value --> use this to write to the array: put information into the array
```
### Printing an array
```
Trying to print the array reference will not show the elements, but instead some hash about the object in the memory

To print an array we need to use the utility class and its method:
    Arrays.toString(arr) -> returns a String format of the array
```

### For each loop
    a loop used to iterate elements from a collection/data structure
    
    we know arrays at this point
    
        for(datatype variableName: array) {
        
        }   

    flow: goes from the first element to the last always, every iteration the variableName represent every element, one element at a time
    
    the variableName is the same as arrayName[i] in a for loop where i is the index from 0 to the end of the array

> Note: The for each loop can only be used when reading/using information from the array, but whenever specific indexes are needed, or the array needs to be modified then the for each loop cannot be used
---
### Multidimensional arrays
```
Allows the array to hold other arrays. The element of a multidimensional array is a single array

single array
    int [] a = { 1, 2, 3};

2D array
    int [][] arr = {
        {1, 2, 3},
        {4, 5, 6}
    }

    arr[1] -> {4, 5, 6}
    arr[1] = { 10, 30 10};

 To access the elements we will still use indexes. In this case the elements are other arrays

- To create a 2d array you can use single array variables, or make the single arrays right away in the declaration

Print the multidimensional arrays:
    Arrays.deepToString(arr);
```

#### declaring 2D array
```
	datatType [][] arrayName = new dataType[x][z];

		where x is how many elements the 2D array has - number of arrays

		where z is the size of each inner array
			-> is optional to define. If it is not defined then the inner arrays sizes do not matter, they can be different

	datatType [][] arrayName = { arrayName1, arrayName2, etc}

	dataType [][] arrayName = { {element, element, element, etc}, {element, element, element, etc}, {element, element, element, etc} };
```

#### Iterating through a 2D array:
```
for each:
    for(double[] eachInner : prices){ <-- elements of prices are 1D, double arrays. In the loop we are calling them eachInner
        for(double eachNum : eachInner){
            // now we have access to each price number using eachNum variable
        }
    }

traditional: 
    for(int i = 0; i < prices.length; i++){
        for(int j = 0; j < prices[i].length; j++){ // prices[i].length --> length of each inner array
            // here we have access to each price number using prices[i][j]
        }
    }
```
---
## Wrapper Classes
    object representation of the primitive datatypes
	classes are defined in java.lang

```
primitive 	|	wrapper class/object
------------------------------
byte		| 	Byte
short		|	Short
int 		|	Integer
long 		|	Long	
float 		|	Float
double 		|	Double
char 		|	Character
boolean 	|	Boolean
```
```
Why do we need these?
    1) Collections do not work with primitive datatypes
        -> ArrayList will be our first collection, so ArrayList will not work with primitive datatypes

    2) The wrapper classes have helpful methods and information

How to create the wrapper class object:
    className variable = value <- preferred way

    ex:
        Integer i = 10;

IQ: What is autoboxing and unboxing?
	* Both are done automatically
	
    autoboxing: converting the primitive datatype to a wrapper class object

    unboxing: converting from the wrapper class object to the primitive datatype

Useful methods: [See documentation for more]
	
	MAX & MIN values -> variables

    Character.isDigit()
    Character.isLetter()
    Character.isUppercase()
    Character.isLowercase()

    Integer.parseInt() -> convert String to an int type

IQ: difference between parse and valueOf
    parse: return primitive type
    valueOf: return wrapper class objects
	
	Ex: 
    String s = "34";
    Integer.parseInt(s) --> 34 as int type
    Integer.valueOf(s) --> 34 as Integer type
```
---
## ArrayList
```
    ArrayList is a class. Part of the collection framework (we will come back to this at the end of java)
		
    class is located in java.util package

	ArrayList uses arrays internally
	
    ArrayList allows duplicate elements
    ArrayList is ordered. You can access the elements by indexes. Order of the elements is known(insertion order)

    * ArrayList is a dynamic array
        -> in ArrayList the size is NOT fixed
        the size will grow and shrink when needed
		
    Syntax:
        ArrayList<DATATYPE> name = new ArrayList<>();
```
```
Array vs ArrayList
    
    Array
        fixed size
        use both used with primitive & non primitive types
        object type
        no methods
        in general takes less memory
        Need to use Arrays.toString() to print the array

    ArrayList
        dynamic size
        only use object types (non primitive types)
        object type
        has methods
        in general takes more memory
        can be printed using only print statement, no need for anything else
```

```
ArrayList Methods:

    size(): returns the number of elements
        return int
        last index: size() - 1

    add(element): adds the element to the end of the ArrayList
        return boolean -> returns true, we don't usually use this return value.

    add(int, element): adds the element at the given index number. All the other elements move position	

	get(int): return the element at the given index number
		return element 

    clear(): removes all the elements from the ArrayList	

    remove(int): removes the element at the given index. All elements shift over
        returns the element that is removed
        -> if you try to remove an index that doesn't exist: out of bounds

    remove(Object): remove the element that was defined from the ArrayList. 
        returns boolean
            true: if the element was removed
            false: if the element was not removed - if the element did not exist

    isEmpty(): checks if there is any elements in the ArrayList
		returns boolean
			true: ArrayList is empty, no elements
			false: if there is any elements

    contains(element): checks if the ArrayList has the given element
        returns boolean
            true: ArrayList has the element
            false: ArrayList does not have the element

    equals(ArrayList) checks if the given ArrayList is equal to the ArrayList using the method
            return boolean
			true: if the two ArrayList are the same, which means they have the same elements, same order
			false: if the ArrayList are not the same
			
    indexOf(element): returns the index of the given element. The index returned will be the first occurrence of the element   
    	returns int

    set(int, element): replace the element at the given index with the given new element

```
```
Creating ArrayList in different ways

ArrayList<type> name = new ArrayList<>();
    creates an empty ArrayList

ArrayList<type> name = new ArrayList<>( collection type );
    collection type: there is a collection framework that has many components 
			ArrayList is a collection type

ArrayList<type> name = new ArrayList<>( arraylist object );

Using Arrays.asList()
    parameters: an array ( var arg )
        returns: collection type

    Use both parts together to create an ArrayList with values

    ArrayList<type> name = new ArrayList<>( Arrays.asList() );
        Ex: .asList("hello", "world", "Friday")
            .asList(3, 4, 5, 1, 5, 5)
```

#### Collections
```
    a utility class for collection types
    located in java.util package

    Collections.sort()
    Collections.max()
    Collections.min()
    Collections.frequency()

    others: shuffle, reverse, swap
	
    Note: this is just a sample of the methods. For the full list check the documentation 
```

#### Bulk Operation Methods
```
the arguments of each methods are collection types

    addAll(collection type): add all the elements from the given argument to the ArrayList

    removeAll(collection type): removes every occurrence of every element from the given argument

    containsAll(collection type): checks if every element from the given argument is in the ArrayList 

    retainAll(collection type): keeps all the defined elements, but deletes all the others
```
```

Also ArrayList methods: arguments are different

removeIf( lambda )
    to define the argument we will use a lambda expression

syntax for lambda:
    variable -> boolean expression(use that defined variable)
```
---

### Constructor

    a special method that is called when an object is created
	it it called with the new operator
	the constructor is used mainly to initialize our instance variables

	the constructor should be the same as the class name and have no return type(no void either)

	if we don't create a constructor the compile will create a default constructor, which is a no argument constructor
		-> if you create a constructor, the default one is no longer there

	- We can define parameters if we need
```
Ex:
Zoom.java
    public class Zoom{
        public Zoom(){
        }
    }
```

#### this vs this()

	this: reference to the instance of a class
	this(): call a constructor	

#### Constructors can be overloaded

	constructor chaining: one constructor calling another constructor -> we don't have to repeat ourselves 
	
	using this() and passing the argument needed to call a specific constructor
	- reduces repetition

	rules:
		the constructor call should be the first line
		cannot use the class name className(), you need to this()
		only call one constructor
		should not call itself or contain itself

### Static
	keyword that allows us to define members that belong to the class
		-> opposite of instance which are members that belong to the objec

#### instance vs static

    instance: members that belong to the objects
        access from the object
        every object has a copy of every instance members

    static: members that belong to the class
        access from the class name
        every static member has a single copy

        static variable: variable that had one copy belonging to the class

        static methods: methods that has on copy belonging to the class
            -> methods that are accessed quickly
            -> utility method

        static block: a block of code that is written in the class. This code block is executed once in the beginning when the class is loaded into the memory for the first time
            -> used to set up variables, calls methods

        static import: allows you to access one specific static member without giving the class name

        syntax:
            import static packageName.className.staticMember;
                or
            import static packageName.className.*;  
               ->  wildcard allows you to access all static members in that file
---

### Access Modifiers

	keyword that define the visibility or scope
	(where you can use/access variables and methods)

	-> local variables DO NOT have access modifiers

	-> variables, methods, constructors can have any access modifier
	-> classes public or default (main classes)

	[Most Visible] public -> protected -> default -> private [Least Visible]

	public: accessible everywhere in the project

	default: accessible within the same package
		-> when there is no other access modifier

	private: accessible within the same class

	protected: accessible by the classes of the same packages and the subclasses present in any package

---

### Encapsulation:

	allows us to hide information from direct access.
	We limit the access to the variables by making the variable private and created public getter and setter methods

	getter: method that is used to get/return value of that variable
	setter: method that change/reassign the values of a variable

    another definition: encapsulation is the grouping of data and methods into a unit

---

### Inheritance

	allows us to pass information/inherit from one class to another
		+ gives us code re-usability and code maintainability
		+ good organization, allow us to set up ideas, connect classes with similar ideas

	The Object class is the parent of all classes by default

#### How to inherit in java

	use extends keyword in the class declaration

	syntax: Child extends Parent
		-> Parent class passes information to the Child class

	ex:
		public class Planet{
			int distanceFromTheSun;
		}	

		public class Earth extends Planet{
		}

#### Relationship between classes
use 'is a' relation to describe how classes are connected

		child is a parent
		Ex: Earth is a Planet

#### Describe classes in inheritance

	parent == super == base
	child == sub == derived

#### What is inherited:

	all public variables & methods
	all protected variables & methods
	default variables & method that are IN THE SAME PACKAGE

#### What is not inherited:

	all private variables & methods
	default variables & methods that are NOT IN THE SAME PACKAGE
	constructors

#### How many parent classes can we have

	in java you can only have one direct parent class
	java does not allow multi-inheritance with classes (multiple parents at the same)

	ex: you cannot do this:
		class A extends B, C

#### this vs super

	this: reference to the current class object
	super: reference to the super class object

#### this() vs super()

	this(): calling a constructor in current class
	super(): calling a constructor in the parent class

#### constructors in inheritance

	constructors are not inherited
	but, in order to create object the super class constructors must be called
	we need to use super() call

#### Types of Inheritance

	single inheritance
		class Planet{}
		class Mars extends Planet{}

	Multi level
		class Animal {}
		class Dog extends Animal{}
		class Husky extends Dog {}

	Hierarchical
		class Book {
		class AudioBook extends Book {}
		class EBook extends Book {}
		class TextBook extends Book{}

### Method Overriding

	change the implementation(code) of a method that is inherited from a super class
		-> another way to phrase it: after inheriting a method we can change how it works

	use of overriding: create method implementation that is more specific for the sub class

#### @Override

	annotation that helps make sure you override the method correctly
	using the annotation is optional, but recommended to use

#### Q: What is the difference between overloading and overriding

	overloading: having the same method name, but having different parameters
		-> this happens in the same file

	overriding: changing the implementation of a method that came from the super class
		-> this happens across multiple files (super & sub)

#### Method Overriding rules

	method needs to be inherits
	method signature should be the same
		method signature: name + parameters
	access modifier should be the same or more visible

		public > protected > default > private

	return type should be same 
		or covariant: sub class of that return type

	overriding is only for instance methods

---

#### final

	final variable: variable that cannot be reassigned, cannot be changed

		- constants: information/data that are fixed and accessible everywhere
			syntax: public static final variables

			Note: convention for creating constant variables: constant variables are created in all uppercase. underscore for spaces

	final method: method that cannot be overridden -> cannot change the implementation of the method
		sytnax: public final void method(){}

	final class: this class cannot be the parent of another class. 
		syntax: public final class name {}
---

#### Q: Can you override static methods

	NO, they can't be and overriding is for instance methods to make them more specific for its sub class object

	But if you declare a static method in the sub class that has the same name as the the method inherited you will do method hiding
		-> both exist

#### Method overriding vs method hiding:

	instance methods: can be overridden, we can change how the method works in the sub class

	static methods: it will look like we are overriding but the idea is different

		When you try to make a method with the same name and parameters it is doing method hiding
		It means you are creating a new method with the same name, in the sub class
		Because these are static you have access to both static methods with the same name, because each is accessible by their class
---