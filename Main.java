public class Main {
    public static void main(String[] args) throws InterruptedException {
        MessageQueue queue = new MessageQueue(100);

        for(int i=1;i<=5;i++){
            int final_i = i;
            IProducer producer = new Producer(queue);
            Thread t = new Thread(() -> {
                producer.produce(new Message(Integer.toString(final_i), "Message " + final_i));
            });
            t.start();
        }

        Thread.sleep(1000);

        for(int i=1;i<=5;i++){
            IConsumer consumer = new Consumer(queue);
            Thread t = new Thread(() -> {
                new SimpleProcessor().process(consumer.poll());
            });
            t.start();
        }
    }
}
