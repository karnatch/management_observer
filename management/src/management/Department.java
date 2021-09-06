package management;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private List<Worker> members = new ArrayList<>();
	String title;
	public void join(Worker client) {
		members.add(client);
	}
	public void exit(Worker client) {
		members.remove(client);
	}
	public void notifyWorkers() {
		for(Worker member: members) {
			member.notification();
		}
	}
	public void upload(String title) {
		this.title = title;
		notifyWorkers();
	}
}