# Appendix A: Concurrency ii

## Client/Server Example
We have a client/server socket connecting to each other to get data.
We test performance of this code in a 10 seconds timeout.
What factors affect performance ?
- I/O—using a socket, connecting to a database, waiting for virtual memory swapping,
  and so on.
  - Threading will be benefitial
- Processor—numerical calculations, regular expression processing, garbage collection,
  and so on.
  - Threading will not be benefitial that much

### Adding Threading
Applying concurrency and threads comes with some limitations in platform.
we fixed this using Executor framework to handle it for us.
There are different responsibilities to handle:
- Socket connection management
- Client processing
- Threading policy
- Server shutdown policy

## Possible Paths of Execution
```java
public class IdGenerator {
    int lastIdUsed;

    public int incrementValue() {
        return ++lastIdUsed;
    }
}
```
How many path's of execution might be when 2 threads call incrementValue() method?
- Thread 1 gets the value of 94, thread 2 gets the value of 95, and lastIdUsed is now 95.
- Thread 1 gets the value of 95, thread 2 gets the value of 94, and lastIdUsed is now 95.
- Thread 1 gets the value of 94, thread 2 gets the value of 94, and lastIdUsed is now 94.

### Number of Paths
For this simple case of N instructions in a sequence, no looping or conditionals, and T
threads, the total number of possible execution paths is equal to:

`(NT)!/(N!)^T`

for above example we have 8 lines of java bytecode so result is:

`(8*2)!/(8!)^2 = 12,870`

if we change method signature to :
```java
public synchronized void incrementValue() {
    ++lastIdUsed;
}
```
The number of possible execution pathways becomes two for two threads and **N!** in the
general case.

### Digging Deeper
In Jvm specification assignment to a 32-bit value (eg. int) is uninterruptable. so this operation is **Atomic**. but 64-bit value like long is 2 atomic operations.

## Knowing Your Library
### Executor Framework
Executor framework works with classes that implement Runnable or Callable and also supports Future

**Runnable**: an interface to execute instructions without return value.

**Callable**: an interface to execute instructions with a return value.

**Future**: when code needs to execute multiple, independent operations and wait for both to finish.

### Nonblocking Solutions
In modern processors there is an operation called Compare and Swap (CAS) which allows us to use one single atomic operation for any assignment.
see. AtomicBoolean, AtomicInteger and AtomicReference in Java.

### Nonthread-Safe Classes
- SimpleDateFormat
- Database Connections
- Containers in java.util
- Servlets

There are thread-safe classes in java.util.concurrent eg. `ConcurrentHashMap`

## Dependencies Between Methods Can Break Concurrent Code
Having multiple synchronized methods have a subtle side effect.
if client use these methods and have some conditionals to choose between method calls, there will be boundary problems and inconsistencies.

### Tolerate the Failure
Sometimes you can set things up such that the failure causes no harm.

### Client-Based Locking
We can use synchronized lock for all of the clients using server code.
This brings the risk of forgetting a client to lock and blowing system. and also violates DRY.

### Server-Based Locking
create a single method containing all concurrent operations in the server.
In general, you should prefer server-based locking for these reasons:
- It reduces repeated code
- It allows for better performance
- It reduces the possibility of error
- It enforces a single policy
- It reduces the scope of the shared variables

If you don’t own server code, use **ADAPTER** pattern to wrap server call in a single place.

## Increasing Throughput
Consider a page reader program, which downloads some pages and prints statistics

### Single-Thread Calculation of Throughput
Lets assume following facts:
- I/O time to retrieve a page (average): 1 second 
- Processing time to parse page (average): 0.5 seconds

Total execution time = 1.5 seconds * N (pages)

### Multithread Calculation of Throughput
We aquire T times faster throughput where T is thread count.

## Deadlock
When some processes are waiting for each other to release shared resources.
To really solve the problem of deadlock, we need to understand what causes it.
There are four conditions required for deadlock to occur:
- Mutual exclusion
- Lock & wait
- No preemption
- Circular wait

### Mutual exclusion
hen multiple threads need to use the same resources and those resources :
- Cannot be used by multiple threads at the same time.
- Are limited in number.

eg. Database connection, a file open for write

**How to break?**
- Using resources that allow simultaneous use, for example, AtomicInteger.
- Increasing the number of resources such that it equals or exceeds the number of competing threads.
- Checking that all your resources are free before seizing any.

### Lock & Wait
Once a thread acquires a resource, it will not release the resource until it has acquired all
of the other resources it requires and has completed its work.

**How to break?**
refuse to wait, Check each resource before you seize it, and release all resources and start over if you run into one that’s busy.

Problems:
- Starvation
- Livelock

### No Preemption
One thread cannot take resources away from another thread. Once a thread holds a
resource, the only way for another thread to get it is for the holding thread to release it.

**How to break?**
When a thread discovers that a resource is busy, it asks the owner to release it. If the owner is also waiting for some other resource, it releases them all and starts over.

### Circular Wait
This is also referred to as the **deadly embrace**. Imagine two threads, T1 and T2, and two
resources, R1 and R2. T1 has R1, T2 has R2. T1 also requires R2, and T2 also requires R1.

**How to break?**
if all threads can agree on a global ordering of resources and if they all allocate resources in that order, then deadlock is impossible.

## Testing Multithreaded Code
```java 
public class ClassWithThreadingProblem {
    int nextId;

    public int takeNextId() {
        return nextId++;
    }
}
```
Here’s a description of a test that will prove the code is broken:
- Remember the current value of nextId.
- Create two threads, both of which call takeNextId() once.
- Verify that nextId is two more than what we started with.
- Run this until we demonstrate that nextId was only incremented by one instead of two.

Using this approach, the chance that we pass this test is so low (once in million).
- We can use a continuous integration server to run these tests for us with different configurations.
- Run the test on every one of the target deployment platforms.
- Run the tests on a machine with varying loads.

`Make sure to carefully log the conditions under which the test failed.`

## Tool Support for Testing Thread-Based Code
Eg. ConTest from IBM