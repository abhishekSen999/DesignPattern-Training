package com.iteratrlearning.design_patterns.examples.pipes;

public abstract class ProcessingFilter<T> {

    private ProcessingFilter<T> successor;

    public T handle(T input) {
        T result = process(input);
        if(successor != null && result != null) {
            return successor.handle(result);
        }
        return result;
    }

    abstract protected T process(T input);

    public void setSuccessor(ProcessingFilter<T> successor) {
        this.successor = successor;
    }
}
