# Chapter 13: Concurrency

## Why Concurrency?
- Decoupling what gets done from when it gets done.
- Request constraints in web apps (eg. crawler, download manager, …)
- IO, UI, CPU threads
- Provide more efficient response time

## Myths and Misconceptions
- Concurrency always improves performance.
- Design does not change when writing concurrent programs
- Understanding concurrency issues is not important when working with a container
  such as a Web or EJB container.

### Truth
- Concurrency incurs some overhead
- Correct concurrency is complex
- Concurrency bugs aren’t usually repeatable
- Concurrency often requires a fundamental change in design strategy

## Challenges
**Race** condition

## Concurrency Defense Principles
### Single Responsibility Principle
The SRP states that a given method/class/component should have a **single reason to change**.
Recommendation: Keep your concurrency-related code separate from other code.

### Corollary: Limit the Scope of Data
Use **synchronized** keyword to protect shared objects.
Restrict the number of places using shared objects.
Recommendation: Take data encapsulation to heart; severely limit the access of any
data that may be shared.

### Corollary: Use Copies of Data
Immutability matters

if using copies of objects allows the code to avoid synchronizing, the savings in avoiding the intrinsic lock will likely make up for the additional creation and garbage collection overhead.

### Corollary: Threads Should Be as Independent as Possible
Recommendation: Attempt to partition data into independent subsets than can be
operated on by independent threads, possibly in different processors.

## Know Your Library
- Thread safety
- Executor framework
- Nonblocking

## Know Your Execution Models
- Bound Resources
- Mutual Exclusion
- Starvation
- Deadlock
- Livelock

### Producer-Consumer
`One or more producer threads create some work and place it in a buffer or queue. One or
more consumer threads acquire that work from the queue and complete it.`

### Readers-Writers
When you have a shared resource that primarily serves as a source of information for readers,
but which is occasionally updated by writers

### Dining Philosophers
Each philosopher eat with two forks, and put down both forks when finished.

## Beware Dependencies Between Synchronized Methods
Avoid using more than one method on a shared object

## Keep Synchronized Sections Small
extending synchronization beyond the minimal critical section increases
contention and degrades performance

## Writing Correct Shut-Down Code Is Hard
Think about shut-down early and get it working early.

## Testing Threaded Code
Write tests that have the potential to expose problems and then run them frequently

### Treat Spurious Failures as Candidate Threading Issues
Do not ignore system failures as one-offs.

### Get Your Nonthreaded Code Working First
Do not try to chase down nonthreading bugs and threading bugs
at the same time. Make sure your code works outside of threads.

### Make Your Threaded Code Pluggable
Make your thread-based code especially pluggable so that you can run it in various configurations.

### Make Your Threaded Code Tunable
Getting the right balance of threads typically requires trial an error.

### Run with More Threads Than Processors
The more frequently your tasks swap, the more
likely you’ll encounter code that is missing a critical section or causes deadlock

### Run on Different Platforms
Run your threaded code on all target platforms early and often.

### Instrument Your Code to Try and Force Failures
only a very few pathways out of the many thousands of possible pathways through a vulnerable
section actually fail.

## Code instrumentation: Hand-coded
There are many problems with this approach:
- You have to manually find appropriate places to do this.
- How do you know where to put the call and what kind of call to use?
- Leaving such code in a production environment unnecessarily slows the code down.
- It’s a shotgun approach. You may or may not find flaws. Indeed, the odds aren’t with you.

## Code instrumentation: Automated
Use jiggling strategies to ferret out errors.
