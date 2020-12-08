package pattern.observer;

import java.util.HashSet;
import java.util.Set;

public class Publisher {
	Set<Subscriber> list;
	
	public Publisher() {
		list = new HashSet<>();
	}
	
	public void subscribe(Subscriber user) {
		list.add(user);
	}
	
	public void unsubscribe(Subscriber user) {
		list.remove(user);
	}
	
	public void sendNotification(String context) {
		list.forEach(s -> s.receive(context));
	}
}
