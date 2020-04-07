package Decorators;

import DataTypes.NotificationRadius;
import Interfaces.Notification;

public class AreaDecorator extends NotificationDecorator {
    protected NotificationRadius radius;

    public AreaDecorator(Notification decoratedNotification, NotificationRadius radius) {
        super(decoratedNotification);
        this.radius = radius;
    }

    @Override
    public void send() {
        this.decoratedNotification.send();
        System.out.println("Notification Radius: " + this.radius);
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
