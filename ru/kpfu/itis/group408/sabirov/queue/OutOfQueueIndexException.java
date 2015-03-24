package ru.kpfu.itis.group408.sabirov.queue;

/**
 * Created by Тимур on 23.03.2015.
 */
public class OutOfQueueIndexException extends Exception{
    OutOfQueueIndexException(){
        super("Вышли за пределы очереди");
    }
}
