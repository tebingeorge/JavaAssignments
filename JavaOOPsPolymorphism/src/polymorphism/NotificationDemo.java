package polymorphism;

public class NotificationDemo {
	 public static void main(String[] args) {
	 Notification n;
	 n = new EmailNotification();
	 n.send();
	 n = new SMSNotification();
	 n.send();
	 }
	}