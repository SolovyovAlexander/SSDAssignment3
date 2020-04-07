package Decorators;

import Interfaces.Notification;

abstract class NotificationDecorator implements Notification {
    Notification decoratedNotification;


    NotificationDecorator(Notification decoratedNotification) {
        super();
        this.decoratedNotification = decoratedNotification;
    }
}
