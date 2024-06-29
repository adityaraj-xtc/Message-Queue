public class Message {
    private String key;
    private String content;

    public Message(String key, String content) {
        this.key = key;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "key='" + key + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Message(String content) {
        this.key = null;
        this.content = content;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
