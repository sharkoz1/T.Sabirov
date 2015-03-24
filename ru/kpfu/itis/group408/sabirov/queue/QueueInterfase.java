package ru.kpfu.itis.group408.sabirov.queue;

/**
 * Created by Тимур on 23.03.2015.
 */
public interface QueueInterfase <T>{

        T offer() throws OutOfQueueIndexException;
        T peek();
        void poll(T t) throws OutOfQueueIndexException;
        boolean isEmpty();
        int size();
}


