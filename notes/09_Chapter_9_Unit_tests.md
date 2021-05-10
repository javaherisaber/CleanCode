# Chapter 9: Unit tests

## The three laws of TDD
## First law
You may not write production code until you have written a failing unit test.

### Second law
You may not write more of a unit test than is sufficient to fail, and not compliling is failing.

### Third law
You may not write more production code than is sufficient to pass the currently failing test.

## Keeping Tests Clean
- Tests must change as the production code evolves. The dirtier the tests, the harder they are to change.

This section is important (all of it)

## Tests enable the -ilities
- If you have tests, you do not fear making changes to the code!
- Tests enable all the -ilities because it enables CHANGE

## Clean Tests
Readability makes a test clean.
clarity, simplicity, and density of expression makes test readable.
Use BUILD-OPERATE-CHECK pattern for your tests.

## Domain-Specific Testing Language
Building functions and utilities become a specialized API used by the tests.

## A Dual Standard
There are things that you might never do in a production environment that are perfectly fine in a test environment. Usually they involve issues of memory or CPU efficiency. But they never involve issues of cleanliness

## One Assert per Test
the number of asserts in a test ought to be minimized (ideally one assert per test).

## Single Concept per Test
the best rule is that you should minimize the number of asserts per concept and test just one concept per test function.

## F.I.R.S.T rule
**Fast**: Tests should be fast, so that we could run them frequently.

**Independent**: Tests should not depend on each other.

**Repeatable**: Tests should be repeatable in any environment.

**Self-Validating**: The tests should have a boolean output. Either they pass or fail.

**Timely**: Unit tests should be written just before the production code that makes them pass.
