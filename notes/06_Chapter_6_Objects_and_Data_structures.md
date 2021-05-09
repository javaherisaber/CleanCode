# Chapter 6: Objects and Data structures [[Slide](../slides/06_Chapter_6_Objects_and_Data_structures.pptx)]

## Data abstraction
- We keep our variables private to prevent unintended dependency on them, so that we can change implementation.
- If you expose your implementation detail to user, the chance of mistake and bug will raise

## Data/Object Anti-Symmetry
- `Procedural code is easy to add new functions without changing existing data structures
  Object Oriented code is easy to add new classes without changing existing functions`
- Procedural code is hard to add new data structures
  OO code is hard to add new functions (because all classes must change)
- Procedural code is complementory of OO code

## The Law of Demeter
`a module should not know about the innards of the objects it manipulates`

Below code is violating the law of demeter:
```java
final String outputDir = ctxt.getOptions().getScratchDir().getAbsolutePath();
```

### Train wrecks
Calling multiple functions after returning object, one after another is called Train Wrecks.

This would violate the law of demeter.

If above code was returning only data structure instead of object, it wouldn't violate the law of demeter.
```java
final String outputDir = ctxt.options.scratchDir.absolutePath;
```

### Hybrids
having functions, mutators, accessors for public and private variables makes a Hybrid code.

It will makes it hard to add new functions and data structures.

### Hiding Structure
result of law of demeter is:
```
BufferedOutputStream bos = ctxt.createScratchFileStream(classFileName);
```

## Data Transfer Objects
## DTO
a data structure with public variables and no functions.

### Bean
private variables manipulated by getters and setters.

### Active Record
Special form of DTO. data structure with public (or bean-accessed) variables with extra navigational methods like save and find. (example: Model class in Laravel)
- Putting business rules into these classes makes it a Hybrid structure and hard to change.
