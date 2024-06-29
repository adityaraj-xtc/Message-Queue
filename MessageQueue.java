import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MessageQueue {
    BlockingQueue<Message> queue;
    static int DEFAULT_POLLING_SECONDS = 3;
    MessageQueue(int capacity){
        queue = new ArrayBlockingQueue<>(capacity);
    }
    void add(Message message){
        queue.add(message);
    }

    Message fetch() {
        try {
            return queue.remove();
        } catch (NoSuchElementException e){
            return null;
        }
    }
}
