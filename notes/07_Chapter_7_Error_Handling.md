# Chapter 7: Error Handling [[Slide](../slides/07_Chapter_7_Error_Handling.pptx)]

Error handling is important, but if it obscures logic, it’s wrong.

## Use Exceptions Rather Than Return Codes
Using exception for error handling helps separate business logic from error code

## Write Your Try-Catch-Finally Statement First
Your catch has to leave your program in a consistent state, no matter what happens in the try.

So writing try-catch statement first ensures your code is not jeopardizing consistency, and it will make structure of code simpler.

## Use Unchecked Exceptions
Checked exceptions force any change in low level code to affect higher levels.

This will clearly violate Open/Closed principle.

## Provide Context with Exceptions
write a good and self-explanatory message with enough context to be shown in exception stack trace console

## Define Exception Classes in Terms of a Caller’s Needs
- Use wrapper class to compound different exceptions thrown from a function into a common exception type we care about
- Use different classes only if there are times when you want to catch one exception and allow the other one to pass through.

## Define the Normal Flow
Encapsulate **special cases** inside your code so that the caller don't have to deal with default values when there is an exception

## Don’t Return Null
Instead of returning null you can return a special object like **Failure**
or if you're returning a list of object you can simple return an **empty list**
if you really need to return null, mention it in your function name like: getFirstOrNull()

## Don’t Pass Null
- avoid passing null when your argument does not support null
- If you really want to pass null at least use a **nullable** type or **annotation** or any other proper means to declare your parameter as nullable
