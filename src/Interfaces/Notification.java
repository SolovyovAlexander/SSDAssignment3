package Interfaces;

public interface Notification {
    void send();
    void setContent(String content);
    void setReceiver(String receiver);
}
