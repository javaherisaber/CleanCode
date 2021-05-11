# Chapter 12: Emergence

Kent Beck's four rules of Simple Design in XPE book
A design is simple if it follows these rules:
1. Runs all the tests
2. Contains no duplication
3. Expresses the intent of the programmer
4. Minimizes the number of classes and methods

## Simple design rule 1: Runs all the tests
If there is no simple way to verify that the system actually works as intended, then all the paper effort on design is questionable.
Writing tests leads to better designs, because we will have to use dependency injection, interfaces, abstraction and more to make it simpler and minimize coupling.

## Simple design rule 2-4: Refactoring
The fact that we have tests, eliminates the fear that cleaning up the code will break it.

## No duplication
Duplication is the primary enemy of a well-designed system.
Understanding how to achieve reuse in the small is essential to achieving reuse in large
Template method pattern is a common technique for removing higher-level duplication

## Expressive
It's easy to write code that we understand, because at the time we write it we're deep in an understanding of the problem we're trying to solve.

## Minimal classes and methods
We must keep our functions and class counts low as well as making classes and methods small
