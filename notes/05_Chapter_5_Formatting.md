# Chapter 5: Formatting [[Slide](../slides/05_Chapter_5_Formatting.pptx)]

Formatting your code show's your professional attitude and care to details

## The Purpose of Formatting
- The functionality that you create today has a good chance of changing in the next release, but the **readability** of your code will have a profound effect on all the changes that will ever be made
- Your style and discipline survives, even though your code does not

## Vertical Formatting
Small files are usually easier to understand than large files are.

## The Newspaper Metaphor
The topmost parts of the source file should provide the high-level concepts and algorithms. Detail should increase as we move downward, until at the end we find the lowest level functions and details in the source file

## Vertical Openness Between Concepts
Use blank lines to separate different concepts in your code. Eg. Properties, functions, companion object, …

## Vertical density
Lines of code that are tightly related should appear vertically dense. Eg. Related properties like two way data bindings

## Vertical distance
Concepts that are closely related should be kept vertically close to each other.

### Variable Declarations
Variables should be declared close to their usage.

### Instance variables
Put all instance variables of a class at the top of class.

### Dependent Functions
Functions that are dependent on each other should be close Caller above the callee.

### Conceptual affinity
Certain bits of code want to be near other bits.

## Vertical Ordering
Source code dependencies must be downward, details goes down.
Just like newspaper that we see most important subjects abstracted out at top of page.

## Horizontal Formatting
Use 120 characters for line width in your IDE for better readability

### Horizontal openness and density
Put white space between separate concepts, eg. Function arguments, math statements

### Horizontal alignment
There is no need to use horizontal alignment for statements, because code automatic reformating will change it

## Indentation
Every scope of code structure, eg. File, class, method, statement block, … is indented one level to the right.
Don't break indentation rule in single line lambda or anonymous blocks, I know this is tempting for make code smaller, but it makes it less readable instead.

### Dummy scopes
In one line statements like `while` with captured resource loop use indentation and braces to make it more visible

## Team rules
When you write code in a team, agree upon a coding style and follow team rules for it
