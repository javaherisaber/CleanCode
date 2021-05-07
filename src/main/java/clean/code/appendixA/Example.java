package clean.code.appendixA;

/**
 * Example class to demonstrate bytecode
 * and concurrency issue with non atomic operations
 */
public class Example {
    int lastId;

    public void resetId() {
        lastId = 0;
    }

    public int getNextId() {
        return ++lastId;
    }
}
