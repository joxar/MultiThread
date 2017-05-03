package chap3;

import java.util.Random;

public class ServerThread extends Thread {

	private RequestQueue requestQueue;
	private Random random;

	public ServerThread(RequestQueue requestQueue, String name, long seed) {
		super(name);
		this.requestQueue = requestQueue;
		this.random = new Random();
	}
	
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Request request = requestQueue.getRequest();
			System.out.println(Thread.currentThread().getName() + " responses " + request);
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
			}
		}
	}

}
