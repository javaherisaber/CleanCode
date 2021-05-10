# Chapter 10: Classes

## Class organization
Put most important parts of code at top of class, eg. Public properties and functions

## Encapsulation
Keep variables and utility functions, private. Unless you need it in tests or other good reason.

## Classes should be small!
With functions we measured size by counting physical lines, with classes we use a different measure, we count responsibilities.

## The single responsibility principle
- A class or module should have one and only one reason to change                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
- We can reuse codes with **SRP** priciple
- Programmers have fear of breaking problems into too many small parts because they are afraid it would look complex
- Larger portions of code hampers us by insisting we wade through lots of stuff we don't need to know right now.

## Cohesion
When Instance variables of a class are used in most of it's methods. We say this class has HIGH cohesion.
Separating related variables and methods into more classes makes them more cohesive.

## Maintaining cohesion results in many small classes
- When classes lose cohesion, split them.
- Breaking a large function into many smaller functions often gives us the opportunity to split several smaller classes out as well.

## Organizing for change
In clean system we organize our classes so as to reduce the risk of change.

## Isolating from change
Needs will change, therefore code will change.
Instead of depending upon implementation details, create more abstractions and inject them with DIP (Dependency inversion principle)
Code must be les coupled and more cohesive.
Talk about **Cohesion** VS **Coupling**
