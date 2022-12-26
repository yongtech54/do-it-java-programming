package src.ch13.lambda;

@FunctionalInterface
public interface StringConcat {
    public abstract void makeString(String s1, String s2);
}
