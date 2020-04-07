import Interfaces.Notification;

public class BaseNotification implements Notification {
    protected String content;
    protected String receiver;

    BaseNotification() {

    }

    BaseNotification(String content, String receiver) {
        this.content = content;
        this.receiver = receiver;
    }

    @Override
    public void send() {
        System.out.println("Notification sent.");
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
