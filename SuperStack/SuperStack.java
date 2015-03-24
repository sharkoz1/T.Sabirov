package cw1703.SuperStack;

public interface SuperStack<T> {

    public void pop() throws Exception;

    public Object peek();

    public void push(T obj) throws Exception;

    public int size();

    public boolean isEmpty();
}
