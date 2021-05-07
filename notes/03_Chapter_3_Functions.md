# Chapter 3: Functions
[[Slide](../slides/03_Chapter_3_Functions.pptx)]

## Small
- **Line counts** should not be longer than a **screen size**
- **Line width** smaller than `150` characters
- **Line counts** smaller than `100` lines

## Blocks and Indenting
- blocks within conditional (if/when/while...) statements should be **one line long**
- 1 or 2 indentation level at most

## Do One Thing
`FUNCTIONS SHOULD DO ONE THING. THEY SHOULD DO IT WELL.
THEY SHOULD DO IT ONLY.`
- another way to know that a function is doing more than **one thing** is if you can 
  extract another function from it with a name that is not merely a restatement of its implementation

## Sections within Functions
Functions that do one thing cannot be reasonably divided into sections.

## One Level of Abstraction per Function
Mixing level's of abstraction make's function confusing

## Reading Code from Top to Bottom: The Stepdown Rule
We want the code to read like a top-down narrative.
We want every function to be followed by those at the next level of abstraction so that we can read the program, descending one level of abstraction at a time as we read down the list of functions

## Switch Statements
they can be tolerated if they appear only once, are used to create polymorphic objects, and are hidden behind an inheritance relationship so that the rest of the system can’t see them.

## Use Descriptive Names
- Don’t be afraid to make a name long. A long descriptive name is better than a short
	enigmatic name
- A long descriptive name is better than a long descriptive comment
- Don't be afraid to change names

## Function Arguments
- The ideal number of arguments for a function is zero (*niadic*). 
- Next comes one (*monadic*), followed closely by two (*dyadic*). 
- Three arguments (*triadic*) should be avoided where possible. 
- More than three (*polyadic*) requires very special justification—and then shouldn’t be used anyway.

## Common Monadic Forms
- condition arg to decide what to do
- argument to transform into something else
- event

`Using an output argument instead of a return value for a transformation is confusing`

## Flag Arguments
should be avoided, it is loudly proclaiming that this function does more than one thing

## Dyadic Functions
you can simply convert these functions to monadic by moving it to right class as a member function

## Triads
same applies to this

## Argument Objects
using objects for group of variables that declare a concept is better than passing every single one of variables

## Argument Lists
eg. `varargs`
functions with these arguments are simply monadic, dyadic and traids
so same rules applies to them

## Verbs and Keywords
functions and arguments should form a very nice verb/noun pairs eg. `write(name)`
we can use keywords as well to make them more clear eg.
```kotlin
firstOrNull(predicate)
assertExpectedEqualsActual(expected, actual)
```

## Have No Side Effects
### temporal coupling
Temporal coupling is coupling that occurs when there are two or more members of a class that need to be invoked in a particular order. eg:
```
var calculator = new PriceCalculator();
calculator.UpdateCurrencyRates(eur: 1.02, gbp: 1.25);
decimal price = calculator.CalculatePrice(myShoppingCart);
```
[Reference](https://enterprisecraftsmanship.com/posts/temporal-coupling-and-immutability)

Here, currency rates required to calculate the price of a shopping cart.

## Output Arguments
should be avoided

## Command Query Separation
```
public boolean set(String attribute, String value);
if (set("username", "unclebob"))…
if (attributeExists("username")) {
    setAttribute("username", "unclebob");
    ...
}
```

## Prefer Exceptions to Returning Error Codes
returning **error code*** will result in **nested conditional** checks

## Extract Try/Catch Blocks
extract each block to another function

## Error Handling Is One Thing
a function that handles errors should do nothing else

## The Error.java Dependency Magnet
having one enum class for all error codes will force compiler to rebuild every time there is a change in this enum, because all other parts of code have imported this
## Don’t Repeat Yourself
Duplication may be the root of all evil in software

## Structured Programming
### Dijkstra's rule for functions
`every function, and every block within a function, should have one entry and one exit.`

if you keep your functions small, then the occasional multiple return, break, or
continue statement does no harm and can sometimes even be more expressive than the single-
entry, single-exit rule.

## How Do You Write Functions Like This?
you cannot reach clean code at the first try!
when you start writing code, just jot down your thoughts into any clumsy code that pop's up into your mind, duplicate code, complicated loops, it's all O.K
then you start iterating through your code and refine them to smaller functions and clean design
while keeping unit tests passing.
