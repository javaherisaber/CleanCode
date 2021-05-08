# Chapter 4: Comments [[Slide](../slides/04_Chapter_4_Comments.pptx)]

`Don’t comment bad code—rewrite it". Brian W. Kernighan`

## Comments Do Not Make Up for Bad Code
Clear and expressive code with few comments is far superior to cluttered and complex
code with lots of comments

## Explain Yourself in Code
prefer using separate function instead of commenting on if statement with multiple conditions

## Good Comments
### Legal Comments
copyright

### Informative Comments
- function return intention
- comments to show eligible format patterns

### Explanation of Intent
important decisions that can be questionable by other programmers

### Clarification
when you don't have access to api and, you are just consumer of it and there need to be some clarification for it

### Warning of Consequences
eg. SimpleDateFormat is not thread safe, so we need to create each instance independently.

Don't run unless you have some time to kill.

### ToDo
It's okay to put todo comments when you don't have a good solution at the moment

### Amplification
indicate higher importance of notice

### Javadocs in Public APIs
public api's must have java docs

## Bad Comments
### Mumbling
eg. putting in comments for **catch** in try/catch blocks, just to satisfy IDE inspector.

### Redundant Comments
Don't repeat code in comment, add something that has more value and meaning

### Misleading Comments
comment should describe code accurately, otherwise it will mislead other programmers

### Mandated Comments
Not all functions and variables should have java doc, it will just clutter up the code

### Journal Comments
log of changes to code should be maintained in **version control** system, not in code

### Noise Comments
commenting something that we **already know** about code is called noise

eg. // this is default constructor

### Scary Noise
**copy pasting** variable name in comment is a horrible scray noise!

### Don’t Use a Comment When You Can Use a Function or a Variable
eg. section comments, if statement comments

### Position Markers
eg. // Actions //////////////////////////////////

### Closing Brace Comments
separate your code into functions instead of commenting closing braces
eg. 
```
for(~) {
	while(~) {
		if() {
		} // if
	} // while
} // for
```

### Attributions and Bylines
use version control instead of adding author name at top of classes

### Commented-Out Code
leaving commented out code is not a good practice anymore because we have VCS now.

### HTML Comments
If you want to put HTML docs, make sure your tool is displaying human readable format

### Nonlocal Information
referencing global configurations and information in a local function will quickly turn it into a **lie** when those information changes

### Too Much Information
Don’t put interesting **historical discussions** or irrelevant descriptions of details into your comments.

### Inobvious Connection
- The connection between a comment and the code it describes should be obvious
- The purpose of a comment is to explain code that does not explain itself. It is a **pity** when a comment needs its own explanation.

### Function Headers
Short functions don’t need much description.

### Javadocs in Nonpublic Code
nonpublic code doesn't need javadocs for all single parameters

