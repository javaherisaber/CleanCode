package clean.code.appendixA;

public class ClassWithThreadingProblem {
  public int nextId;

  public int takeNextId() {
    return nextId++;
  }
}