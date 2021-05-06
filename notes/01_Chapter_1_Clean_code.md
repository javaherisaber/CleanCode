# Chapter 1: Clean code
[[Slide](../slides/01_Chapter_1_Clean_code.pptx)]

## Bad code
we write bad code because:
- trying to go fast and reach irrational deadline
- you're in **rush**
- you feel that you don't have **time** to do a **good job**
- you're boss will be angry if you took the time to clean up your code
- you were just tired of working on this program and wanted it to be over
- you looked at the **backlog** of other stuff that you had promised to get done and realized that you needed to slam this module together so you could move on to the next.

## Costs of bad code
As the mess piles on top of each other, **productivity** decreases toward zero

### The Grand Redesign in the Sky

1. new tiger team selected to redesign system **from scratch**
2. current system must be **maintained** until new one is ready
3. two teams are in race, tiger team must build everything that old system does meanwhile keeping up with changes that are continuously being made to old system
4. it takes long time for both teams to reach focal point
5. when its done, members demand new system to be redesigned because it's such a mess

### Attitude
- If good code rot so quickly into bad code, it's all **our fault**, we are **unprofessional**
- The managers and marketers look to us for the information they need to make **promises** and **commitments**
- It is unprofessional for programmers to bend to the will of managers who don’t understand the **risks of making messes**.

### The Primal Conundrum
- You will not make the **deadline** by making the mess.
- Indeed, the mess will slow you down instantly, and will force you to miss the deadline.
- The only way to make the deadline—the only way to go fast—is to `keep the code as clean as possible at all times`.

## The Art of Clean Code?
- being able to recognize clean code from dirty code does not mean that we know how to write clean code
- A programmer with **code-sense** will look at a messy module and see options and variations

## What Is Clean Code?
### Bjarne Stroustrup, inventor of C++
- clean code is pleasing to read.
- Bad code tempts the mess to grow! When others change bad code, they tend to make it worse.

### Pragmatic Dave Thomas
A building with broken windows looks like nobody cares about it. So other people stop caring.

### Grady Booch, author of Object Oriented Analysis and Design with Applications
- our code should contain only what is **necessary**.
- clean code should read like well-written prose (can you see images, sounds, humors, … when reading a novel?)

### “Big” Dave Thomas, founder of OTI, godfather of theEclipse strategy
- clean code makes it easy for **other people** to enhance it
- smaller codebase the better

### Michael Feathers, author of Working Effectively with Legacy Code
- Clean code always looks like it was written by someone who cares

### Ron Jeffries, author of Extreme Programming Installed and Extreme ProgrammingAdventures in C#
- Duplicate code is a sign there is an idea in our mind that is not well represented in the code

### Ward Cunningham, inventor of Wiki
- Clean code is a code that is pretty much what you expect it to do
- Beautiful code makes the language look like it was made for the problem.

## Schools of Thought
- Often master martial artists will form their own schools of thought and gather students to learn from them
- These recommendations are controversial, you might agree or disagree our point of view

## We Are Authors
- authors have readers
- the ratio of time spent reading vs. writing is well over 10:1.
- if you want your code to be easy to write, make it easy to read. (you read surrounding code all the times)

## The Boy Scout Rule
`Leave the campground cleaner than you found it`
Examples:
- Change one variable name for the better
- break up one function that’s a little too large
- eliminate one small bit of duplication
- clean up one composite if statement

## Prequel and Principles
This book is prequel to the book :
Agile Software Development: Principles, Patterns, and Practices (PPP)
by uncle bob 2002

## Conclusion
Books on art don’t promise to make you an artist. All they can do is give you some of the
tools, techniques, and thought processes that other artists have used.