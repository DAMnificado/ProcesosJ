package Activity02_SyncPingPong;

public class Cola {
	
	private boolean x = true;
	
	public synchronized void printPing() {
		try {
			while (!x) wait();
			System.out.println("Ping");
			x = false;
			notifyAll();
		} catch (InterruptedException e) {}
	}
	
	public synchronized void printPong() {
		try {
			while (x) wait();
			System.out.println("Pong");
			x = true;
			notifyAll();
		} catch (InterruptedException e) {}
	}

}
