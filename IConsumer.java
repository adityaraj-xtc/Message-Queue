public interface IConsumer{
    void register(MessageQueue queue);
    Message poll();

}
