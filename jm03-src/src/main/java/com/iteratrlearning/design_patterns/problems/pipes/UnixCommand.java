package com.iteratrlearning.design_patterns.problems.pipes;

public abstract class UnixCommand<T> {

    private UnixCommand<T> successor;

    public T execute(T input) {
        T result = process(input);
        if(successor != null && result != null) {
            return successor.execute(result);
        }
        return result;
    }

    abstract protected T process(T input);

    public void setSuccessor(UnixCommand<T> successor) {
        this.successor = successor;
    }
}
