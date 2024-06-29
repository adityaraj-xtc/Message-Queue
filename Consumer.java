public class Consumer implements IConsumer{
    MessageQueue queue;

    Consumer(MessageQueue queue){
        this.queue = queue;
    }
    @Override
    public void register(MessageQueue queue) {
        this.queue = queue;
    }

    public Message poll() {
        return queue.fetch();
    }

}
