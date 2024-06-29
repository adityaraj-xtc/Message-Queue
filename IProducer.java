public interface IProducer {
    void register(MessageQueue queue);
    void produce(Message message);
}
