public class Queue <T> implements QueueInterfase<T>{

    private Object[] queue;
    private int head = 0; //начало, сдвигается при убирании элемента
    private int tail = 0; //конец, сдвигается при добавлении элемента

    public Queue(int size){
        queue = new Object[size];
    }

    @Override
    public T offer() throws OutOfQueueIndexException { //получение и удаление 1 элемента
        if((head + 1) == queue.length) {
            throw new OutOfQueueIndexException();
        }
        return (T) queue[head++];
    }

    @Override
    public T peek(){ //получение 1 элемента
        return (T) queue[head];
    }

    @Override
    public void poll(T t) throws OutOfQueueIndexException { //добавление элемента
        if((tail + 1) == queue.length){
            throw new OutOfQueueIndexException();
        }else{
            queue[tail++] = t;
        }
    }

    @Override
    public int size(){ //кол-во элементов в очереди
        return tail - head;
    }

    @Override
    public boolean isEmpty(){ //проверка очереди на пустоту
        return size() == 0;
    }

	public Object[] getQueue(){
		return queue;
	}
	
	public int getHead(){
		return head;
	}
}
