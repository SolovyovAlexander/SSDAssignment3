package Decorators;

import DataTypes.NotificationSound;
import Interfaces.Notification;

public class SoundDecorator extends NotificationDecorator {
    protected NotificationSound sound;

    public SoundDecorator(Notification decoratedNotification, NotificationSound sound) {
        super(decoratedNotification);
        this.sound = sound;
    }

    @Override
    public void send() {
        this.decoratedNotification.send();
        System.out.println("Notification Sound: " + this.sound);
    }

    @Override
    public void setContent(String content) {
        this.decoratedNotification.setContent(content);
    }

    @Override
    public void setReceiver(String receiver) {
        this.decoratedNotification.setReceiver(receiver);
    }
}
