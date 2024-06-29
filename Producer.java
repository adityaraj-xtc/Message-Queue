public class Producer implements IProducer{

    MessageQueue queue;

    public Producer(MessageQueue queue) {
        this.queue = queue;
    }

    @Override
    public void register(MessageQueue queue) {
        this.queue = queue;
    }

    @Override
    public void produce(Message message) {
        queue.add(message);
    }
}
