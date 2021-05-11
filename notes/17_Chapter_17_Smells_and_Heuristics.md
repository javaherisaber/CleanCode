# Chapter 17: Smells and Heuristics

## Comments
### C1: Inappropriate Information
Comments should be reserved for technical notes about the code and design

### C2: Obsolete Comment
If you find an obsolete comment, it is best to update it or get rid of it as quickly as possible

### C3: Redundant Comment
A comment is redundant if it describes something that adequately describes itself

### C4: Poorly Written Comment
If you are going to write a comment, take the time to make sure it is the best comment you can write

### C5: Commented-Out Code
When you see commented-out code, delete it! Don’t worry, the source code control system still remembers it.

## Environment
### E1: Build Requires More Than One Step
Building a project should be a single trivial operation.

### E2: Tests Require More Than One Step
You should be able to run all the unit tests with just one command.

## Functions
### F1: Too Many Arguments
More than three is very questionable and should be avoided with prejudice.

### F2: Output Arguments
Readers expect arguments to be inputs, not outputs.

### F3: Flag Arguments
Boolean arguments loudly declare that the function does more than one thing.

### F4: Dead Function
Methods that are never called should be discarded.

## General
### G1: Multiple Languages in One Source File
We should take pains to minimize both the number and extent of extra languages in our source files.

### G2: Obvious Behavior Is Unimplemented
The Principle of Least Surprise
If the code surprisingly do something else than expected, users of code lose their trust in the original author and must fall back on reading the details of the code

### G3: Incorrect Behavior at the Boundaries
Don’t rely on your intuition. Look for every boundary condition and write a test for it.

### G4: Overridden Safeties
Turning off safety inspections may be soothing at first. but will result endless debugging sessions

### G5: Duplication
Don't repeat yourself (DRY)

### G6: Code at Wrong Level of Abstraction
Don't mix lower level and higher level of abstractions. separate them into good components.

### G7: Base Classes Depending on Their Derivatives
base classes should know nothing about their derivatives.

### G8: Too Much Information
Expose as little information as possible.

### G9: Dead Code
Dead code is code that isn’t executed.

### G10: Vertical Separation
Related codes must have least vertical distance from each other.

### G11: Inconsistency
Stick to your conventions across codebase.

### G12: Clutter
Redundant and unused codes makes clutter

### G13: Artificial Coupling
artificial coupling is a coupling between two modules that serves no direct purpose.

### G14: Feature Envy
Reaching other objects internals in a function.

### G15: Selector Arguments
Passing argument to a function in order to select the behavior of the function.

### G16: Obscured Intent
Using notations and symbols to shorten code would obscure our intent to reader.

### G17: Misplaced Responsibility
Code should be placed where a reader would naturally expect it to be.

### G18: Inappropriate Static
Prefer using nonstatic methods instead of static methods.

### G19: Use Explanatory Variables
Intermediate variables make it obvious what the outputs are.

### G20: Function Names Should Say What They Do
If you have to look at the implementation (or documentation) of the function to know
what it does, then you should work to find a better name or rearrange the functionality.

### G21: Understand the Algorithm
Writing function to just work is not enough, make sure you understand how it works.

### G22: Make Logical Dependencies Physical
If one module depends upon another, that dependency should be physical, not just logical.
The dependent module should not make assumptions (in other words, logical dependencies)
about the module it depends upon. Rather it should explicitly ask that module for all
the information it depends upon.

### G23: Prefer Polymorphism to If/Else or Switch/Case
There may be no more than one switch statement for a given type of selection. The cases in that switch statement must create polymorphic objects that take the place of other such switch statements in the rest of the system.

### G24: Follow Standard Conventions
Every team should follow a coding standard based on common industry norms.

### G25: Replace Magic Numbers with Named Constants
it is a bad idea to have raw numbers in your code.

### G26: Be Precise
Ambiguities and imprecision in code are either a result of disagreements or laziness.

### G27: Structure over Convention
Enforce design decisions with structure over convention.

### G28: Encapsulate Conditionals
Extract functions that explain the intent of the conditional.

### G29: Avoid Negative Conditionals
Negatives are just a bit harder to understand than positives.

### G30: Functions Should Do One Thing
It is often tempting to create functions that have multiple sections that perform a series of
operations.

### G31: Hidden Temporal Couplings
Make the temporal coupling explicit by returning result from functions and putting as argument for next operation.

### G32: Don’t Be Arbitrary
Have a reason for the way you structure your code, and make sure that reason is communicated
by the structure of the code.

### G33: Encapsulate Boundary Conditions
Boundary conditions are hard to keep track of. Put the processing for them in one place.

### G34: Functions Should Descend Only One Level of Abstraction
Mixing multiple levels of abstraction make's code harder to understand and change.

### G35: Keep Configurable Data at High Levels
If you have a constant such as a default or configuration value that is known and expected
at a high level of abstraction, do not bury it in a low-level function.

### G36: Avoid Transitive Navigation
In general, we don’t want a single module to know much about its collaborators. More specifically, if A collaborates with B, and B collaborates with C, we don’t want modules that use A to know about C.

## Java
### J1: Avoid Long Import Lists by Using Wildcards
If you use two or more classes from a package, then import the whole package with wildcards.

### J2: Don’t Inherit Constants
Instead of inheriting constants from interfaces, you can use static import

### J3: Constants versus Enums
Prefer using enums instead of constants.

## Names
### N1: Choose Descriptive Names
Don’t be too quick to choose a name. Make sure the name is descriptive. your name must be pretty much what reader expect it to do.

### N2: Choose Names at the Appropriate Level of Abstraction
Don’t pick names that communicate implementation; choose names the reflect the level of
abstraction of the class or function you are working in.

### N3: Use Standard Nomenclature Where Possible
Names are easier to understand if they are based on existing convention or usage.

### N4: Unambiguous Names
Choose names that make the workings of a function or variable unambiguous.

### N5: Use Long Names for Long Scopes
The longer the scope of the name, the longer and more precise the name should be.

### N6: Avoid Encodings
Keep your names free of Hungarian pollution.

### N7: Names Should Describe Side-Effects
Don’t hide side effects with a name. Don’t use a simple verb to describe a function that does more than just that simple action.

## Tests
### T1: Insufficient Tests
The tests are insufficient so long as there are conditions that have not been explored by the
tests or calculations that have not been validated.

### T2: Use a Coverage Tool!
Coverage tools reports gaps in your testing strategy.

### T3: Don’t Skip Trivial Tests
They are easy to write and have high documentary value.

### T4: An Ignored Test Is a Question about an Ambiguity
Sometimes we are uncertain about a behavioral detail because the requirements are
unclear.

### T5: Test Boundary Conditions
often get the middle of an algorithm right but misjudge the boundaries.

### T6: Exhaustively Test Near Bugs
You’ll probably find that the bug was not alone.

### T7: Patterns of Failure Are Revealing
Sometimes just seeing the pattern of red and green on the test report is enough to spark the “Aha!” that leads to the solution.

### T8: Test Coverage Patterns Can Be Revealing
Looking at the code that is or is not executed by the passing tests gives clues to why the
failing tests fail.

### T9: Tests Should Be Fast
do what you must, to keep your tests fast.
