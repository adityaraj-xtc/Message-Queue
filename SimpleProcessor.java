public class SimpleProcessor implements IProcessor{
    @Override
    public void process(Message message) {
        if(message == null){
            System.out.println("No message found");
            return;
        }
        System.out.println(message);
    }
}
