package cw1703.SuperStack;

/**
 * Created by Тимур on 17.03.2015.
 */
public class ArrayStack<T> implements SuperStack<T> {

    private int count;
    private int size = 0;
    private Object [] stack = new Object[20];

    public ArrayStack(){
        for (int i = 0; i < stack.length; i++) {
            stack[i] = null;
        }
    }

    @Override
    public void pop() throws Exception{
        count--;
        stack[count] = null;
    }

    @Override
    public Object peek() {
        return stack[count];
    }

    @Override
    public void push(Object obj) throws Exception{
        stack[count] = obj;
        count++;
    }

    @Override
    public int size() {
        if(isEmpty() == true){
            return 0;
        } else {
            for (int i = 0; i < stack.length; i++) {
                if(stack[i] != null){
                    size++;
                }
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < stack.length; i++) {
            if(stack[i] != null){
                return true;
            }
        }
        return false;
    }
}
